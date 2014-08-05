package fm.html

object Html5CodeGen {
  def main(args: Array[String]): Unit = {
    println("""//
// THIS FILE IS AUTO-GENERATED!  DO NOT MODIFY IT!
// THIS FILE IS AUTO-GENERATED!  DO NOT MODIFY IT!
// THIS FILE IS AUTO-GENERATED!  DO NOT MODIFY IT!
//
// Use Html5CodeGen to re-generate
//
package fm.html

import java.net.{URLEncoder, URLDecoder}
import org.apache.commons.lang3.StringEscapeUtils

trait Html5Tag

object Html5 extends Html5

trait Html5 {
  final implicit def unitToString(unit: Unit): String = ""
  final implicit def optionToString(opt: Option[String]): String = opt.orNull

  /** HTML Escape */
  final def h(s: String): String = StringEscapeUtils.escapeHtml4(s)

  /** Javascript Escape */
  final def j(s: String): String = StringEscapeUtils.escapeEcmaScript(s)

  /** URLEncode */
  final def u(s: String): String = urlencode(s)

  final def urlencode(s: String): String = URLEncoder.encode(s,"UTF-8")
  final def urldecode(s: String): String = URLDecoder.decode(s, "UTF-8")

  protected def appendExtra(prefix: String, map: Map[String, String])(implicit ctx: Html5RenderCtx): Unit = {
    map.filterNot{ case (name, value) => name == null || value == null }.foreach{ case (name, value) => ctx.append(" "+prefix+name+"=\""+h(value)+"\"") }
  }

  /** Append ESCAPED characters */
  final def txt(s: String)(implicit ctx: Html5RenderCtx): Unit = ctx.append(h(s))

  /** Append RAW characters */
  final def raw(s: String)(implicit ctx: Html5RenderCtx): Unit = ctx.append(s)

  final def space(implicit ctx: Html5RenderCtx): Unit = ctx.append(" ")

  final def nbsp(implicit ctx: Html5RenderCtx): Unit = ctx.append("&nbsp;")
  final def copy(implicit ctx: Html5RenderCtx): Unit = ctx.append("&copy;")
  final def middot(implicit ctx: Html5RenderCtx): Unit = ctx.append("&middot;")

  final def comment(body: => String)(implicit ctx: Html5RenderCtx): Unit = {
    ctx.appendOpeningIndent()
    ctx.append("<!--")
    ctx.incrementIndent()
    val b = body
    if (null != b && b != "") ctx.append(" "+b+" ")
    ctx.decrementIndent()
    ctx.appendClosingIndent()
    ctx.append("-->")
  }

  final def CDATA(body: => String)(implicit ctx: Html5RenderCtx): Unit = {
    ctx.append("<![CDATA[")
    ctx.append(body)
    ctx.append("]]>")
  }

  final def DOCTYPE(tpe: String = "html")(implicit ctx: Html5RenderCtx): Unit = ctx.append(s"<!DOCTYPE $tpe>")
    """)
    
    allTags.map{ genCode }.foreach { println }
    
    println("}")
  }

  def genCode(tag: TagDef): String = {
    val name = tag.name
    val className = name.toUpperCase
    
    // <object> has a data parameter so we can't use that name
    val useDataParam = name != "object"
    
    val extra = if (useDataParam) Seq("data", "aria", "attrs") else Seq("aria", "attrs")
    
    val requiredParams = tag.required.map{ fixParamName(_) + ": String" }
    //val requiredParams = tag.required.map{ fixParamName(_) + ": String = null" }
    val optionalParams = tag.optional.map{ fixParamName(_) + ": String = null" }
    val boolParams = tag.boolean.map{ fixParamName(_) + ": Boolean = false" }
    val extraParams = extra.map{ fixParamName(_) + ": Map[String,String] = Map.empty" }
    
    val paramsForDef = (requiredParams ++ optionalParams ++ boolParams ++ extraParams).mkString(", ")
    
    val paramNames = (tag.required ++ tag.optional ++ tag.boolean ++ extra).map{ fixParamName }
    
    val openBodyLines = Vector.newBuilder[String]
    
    openBodyLines ++= (tag.required ++ tag.optional).map{ p: String => s"""if (${fixParamName(p)} ne null) ctx.append(" $p=\\""+h(${fixParamName(p)})+"\\"")""" }
    openBodyLines ++= tag.boolean.map{ p: String => s"""if (${fixParamName(p)}) ctx.append(" $p")""" }
    if (useDataParam) openBodyLines += """appendExtra("data-", data)"""
    openBodyLines += """appendExtra("aria-", aria)"""
    openBodyLines += """appendExtra("", attrs)"""
    
    val openBody: String = openBodyLines.result.map{ "      "+_ }.mkString("\n")
    
    val incrementIndent: String = if (tag.isBlock) "ctx.incrementIndent(); " else ""
    val decrementIndent: String = if (tag.isBlock) "ctx.decrementIndent(); " else ""
    val appendOpeningIndent: String = if (tag.isBlock) """ctx.appendOpeningIndent(); """ else ""
    val appendClosingIndent: String = if (tag.isBlock) """ctx.appendClosingIndent(); """ else ""
    
    if (tag.hasBody) {
      val bodyParam = if (tag.hasBody && !tag.hasEmptyBody) "(body: => String)" else ""
      val bodyCallCode = if (tag.hasBody && !tag.hasEmptyBody) " ctx.append(h(body)); " else ""
      val noParamsApply = if (tag.required.isEmpty) s"""@inline final def apply${bodyParam}(implicit ctx: Html5RenderCtx): Unit = { ${appendOpeningIndent}ctx.append("<$name>");${incrementIndent}${bodyCallCode}this.close() }""" else ""
      val emptyArgsApply = if (tag.required.isEmpty && !tag.hasEmptyBody) s"""final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")""" else ""
      
      s"""
  final val ${tag.valName}: $className = new $className
  final class $className extends Html5Tag {
    $noParamsApply
    $emptyArgsApply
    @inline final def apply($paramsForDef)$bodyParam(implicit ctx: Html5RenderCtx): Unit = { this.open(${paramNames.mkString(", ")});${bodyCallCode}this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ${decrementIndent}${appendClosingIndent}ctx.append("</${name}>") }
    final def open($paramsForDef)(implicit ctx: Html5RenderCtx): Unit = {
      $appendOpeningIndent
      ctx.append("<${name}")
      $incrementIndent
$openBody
      ctx.append(">")
    }
  }
      """.stripLineEnd
    } else {
      val noParamsApply = if (tag.required.isEmpty) s"""final def apply(implicit ctx: Html5RenderCtx): Unit = { ${appendOpeningIndent}ctx.append("<$name>") }""" else ""
    s"""
  final val ${tag.valName}: $className = new $className
  final class $className extends Html5Tag {
    $noParamsApply
    final def apply($paramsForDef)(implicit ctx: Html5RenderCtx): Unit = {
      $appendOpeningIndent
      ctx.append("<${name}")
$openBody
      ctx.append(">")
    }
  }
""".stripLineEnd      
    }
  }

  /** BLOCK Element Tag WITH a body */
  def b_b(name: String, optional: String*): TagDef = global(name, hasBody = true, isBlock = true, optional = optional)
  def b_b(name: String, required: Seq[String], boolean: Seq[String], optional: String*): TagDef = global(name, hasBody = true, isBlock = true, required = required, boolean = boolean, optional = optional)
  
  /** INLINE Element Tag WITH a body  */
  def i_b(name: String, optional: String*): TagDef = global(name, hasBody = true, isBlock = false, optional = optional)
  def i_b(name: String, required: Seq[String], boolean: Seq[String], optional: String*): TagDef = global(name, hasBody = true, isBlock = false, required = required, boolean = boolean, optional = optional)
  
  /** BLOCK Element Tag WITHOUT a body */
  def b_nb(name: String, optional: String*): TagDef = global(name, hasBody = false, isBlock = true, optional = optional)
  def b_nb(name: String, required: Seq[String], boolean: Seq[String], optional: String*): TagDef = global(name, hasBody = false, isBlock = true, required = required, boolean = boolean, optional = optional)
  
  /** INLINE Element Tag WITHOUT a body */
  def i_nb(name: String, optional: String*): TagDef = global(name, hasBody = false, isBlock = false, optional = optional)
  def i_nb(name: String, required: Seq[String], boolean: Seq[String], optional: String*): TagDef = global(name, hasBody = false, isBlock = false, required = required, boolean = boolean, optional = optional)
  
  def global(name: String, hasBody: Boolean, isBlock: Boolean, hasEmptyBody: Boolean = false, required: Seq[String] = Nil, boolean: Seq[String] = Nil, optional: Seq[String] = Nil): TagDef = {
    TagDef(name, required, optional ++ globalAttributes, boolean ++ globalBooleanAttributes, hasBody, isBlock, hasEmptyBody, bodyIsCData = false)
  }
  
  final case class TagDef(name: String, required: Seq[String], optional: Seq[String], boolean: Seq[String], hasBody: Boolean, isBlock: Boolean, hasEmptyBody: Boolean, bodyIsCData: Boolean) {
    if (hasEmptyBody) require(hasBody, "hasEmptyBody is true but hasBody is false!")
    
    def valName: String = FixedTagNames.getOrElse(name, name)
  }
  
  def fixParamName(name: String): String = FixedParamNames.getOrElse(name, name)
  
  val FixedParamNames = Map(
    "class" -> "clazz",
    "type" -> "tpe",
    "accept-charset" -> "acceptCharset",
    "http-equiv" -> "httpEquiv",
    "for" -> "`for`"
  )
  
  val FixedTagNames = Map(
    "object" -> "`object`"
  )
  
  // Global Attributes (http://www.w3schools.com/tags/ref_standardattributes.asp)
  val globalAttributes = Vector(
      // Standard HTML5 Attributes
      "accesskey",
      "class",
      "contenteditable",
      "contextmenu",
      "dir",
      "draggable",
      "dropzone",
      "id",
      "lang",
      "spellcheck",
      "style",
      "tabindex",
      "title",
      "translate",
      // Accessibility Attributes
      "role",
      // Microdata Attributes
      "itemtype",
      "itemprop",
      // Events
      // TODO: target these only to the elements that they apply to
      "onclick"
  )
  
  val globalBooleanAttributes = Vector(
    // Standard HTML5 Boolean Attributes
    "hidden",
    // Microdata
    "itemscope"
  )
  
  // Most of the HTML5 Tags From: http://www.w3schools.com/tags/
  val allTags = Vector(
    i_b("a", "charset", "coords", "download", "href", "hreflang", "media", "name", "rel", "rev", "shape", "target", "type"),
    i_b("abbr"),
    b_b("address"),
    b_nb("area", "alt", "coords", "download", "href", "hreflang", "media", "rel", "shape", "target", "type"),
    b_b("article"),
    b_b("aside"),
    b_nb("audio", required = Nil, boolean = Seq("autoplay", "loop", "muted"), "controls", "preload", "src"),
    i_b("b"),
    b_nb("base", "href", "target"),
    b_b("blockquote", "cite"),
    b_b("body"),
    i_nb("br"),
    i_b("button", required = Nil, boolean = Seq("autofocus", "disabled", "formnovalidate"), "form", "formaction", "formenctype", "formmethod", "formtarget", "name", "type", "value"),
    b_b("canvas", "height", "width"),
    i_b("caption"),
    i_b("cite"),
    b_b("code"),
    b_nb("col", "span"),
    b_b("colgroup", "span"),
    i_b("command", required = Nil, boolean = Seq("checked", "disabled"), "icon", "label", "radiogroup", "type"),
    b_b("datalist"),
    b_b("dd"),
    i_b("del", "cite", "datetime"),
    b_b("details", required = Nil, boolean = Seq("open")),
    i_b("dfn"),
    i_b("dialog", required = Nil, boolean = Seq("open")),
    b_b("div"),
    b_b("dl"),
    b_b("dt"),
    i_b("em"),
    b_b("embed", "height", "src", "type", "width"),
    b_b("fieldset", required = Nil, boolean = Seq("disabled"), "form", "name"),
    b_b("figcaption"),
    b_b("figure"),
    b_b("footer"),
    b_b("form", required = Nil, boolean = Seq("novalidate"), "accept-charset", "action", "autocomplete", "enctype", "method", "name", "target"),
    b_b("head"),
    b_b("header"),
    b_b("h1"), b_b("h2"), b_b("h3"), b_b("h4"), b_b("h5"), b_b("h6"),
    b_b("hr"),
    b_b("html", "manifest"),
    i_b("i"),
    global("iframe", hasBody = true, isBlock = true, hasEmptyBody = true, optional = Seq("height", "name", "sandbox", "seamless", "src", "srcdoc", "width")),
    i_nb("img", "alt", "crossorigin", "height", "ismap", "src", "usemap", "width"),
    b_nb("input", required = Nil, boolean = Seq("autofocus", "checked", "disabled", "formnovalidate", "multiple", "readonly", "required"), "accept", "alt", "autocomplete", "form", "formaction", "formenctype", "formmethod", "formtarget", "height", "list", "max", "maxlength", "min", "name", "pattern", "placeholder", "size", "src", "step", "type", "value", "width"),
    i_b("ins", "cite", "datetime"),
    i_b("kbd"),
    i_nb("keygen", required = Nil, boolean = Seq("autofocus", "challenge", "disabled"), "form", "keytype", "name"),
    i_b("label", "for", "form"),
    b_b("legend"),
    b_b("li", "value"),
    b_nb("link", required = Seq("rel"), boolean = Nil, "href", "hreflang", "media", "sizes", "type"),
    b_b("map", "name"),
    i_b("mark"),
    b_b("menu", "label", "type"),
    b_nb("meta", "charset", "content", "http-equiv", "name"),
    i_b("meter", required = Seq("value"), boolean = Nil, "form", "high", "low", "max", "min", "optimum"),
    b_b("nav"),
    b_b("noscript"),
    b_b("object", "data", "form", "height", "name", "type", "usermap", "width"),
    b_b("ol", required = Nil, boolean = Seq("compact", "reversed"), "start", "type"),
    b_b("optgroup", required = Nil, boolean = Seq("disabled"), "label"),
    b_b("option", required = Nil, boolean = Seq("disabled", "selected"), "label", "value"),
    b_b("output", "for", "form", "name"),
    b_b("p"),
    b_nb("param", "name", "value"),
    b_b("pre"),
    i_b("progress", "max", "value"),
    i_b("q", "cite"),
    i_b("rp"), i_b("rt"), i_b("ruby"),
    i_b("s"),
    i_b("samp"),
    b_b("script", required = Nil, boolean = Seq("async", "defer"), "charset", "src", "type"),
    b_b("section"),
    b_b("select", required = Nil, boolean = Seq("autofocus", "disabled", "multiple", "required"), "form", "name", "size"),
    i_b("small"),
    b_nb("source", "media", "src", "type"),
    i_b("span"),
    i_b("strong"),
    b_b("style", required = Nil, boolean = Seq("scoped"), "media", "type"),
    i_b("sub"),
    b_b("summary"),
    i_b("sup"),
    b_b("table", required = Nil, boolean = Seq("sortable"), "border"),
    b_b("tbody"),
    b_b("td", "colspan", "rowspan"),
    b_b("textarea", required = Nil, boolean = Seq("autofocus", "disabled", "readonly", "required"), "cols", "form", "maxlength", "name", "placeholder", "rows", "wrap"),
    b_b("tfoot"),
    b_b("th", "abbr", "colspan", "headers", "rowspan", "scope", "sorted"),
    b_b("thead"),
    i_b("time", "datetime"),
    b_b("title"),
    b_b("tr"),
    b_nb("track", required = Seq("src"), boolean = Seq("default"), "kind", "label", "srclang"),
    i_b("u"),
    b_b("ul"),
    b_b("variable"),
    b_b("video", required = Nil, boolean = Seq("autoplay", "controls", "loop", "muted"), "height", "poster", "preload", "src", "width"),
    i_nb("wbr")
  )
}