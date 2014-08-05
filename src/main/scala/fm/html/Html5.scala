//
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
    

  final val a: A = new A
  final class A extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<a>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(charset: String = null, coords: String = null, download: String = null, href: String = null, hreflang: String = null, media: String = null, name: String = null, rel: String = null, rev: String = null, shape: String = null, target: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(charset, coords, download, href, hreflang, media, name, rel, rev, shape, target, tpe, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</a>") }
    final def open(charset: String = null, coords: String = null, download: String = null, href: String = null, hreflang: String = null, media: String = null, name: String = null, rel: String = null, rev: String = null, shape: String = null, target: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<a")
      
      if (charset ne null) ctx.append(" charset=\""+h(charset)+"\"")
      if (coords ne null) ctx.append(" coords=\""+h(coords)+"\"")
      if (download ne null) ctx.append(" download=\""+h(download)+"\"")
      if (href ne null) ctx.append(" href=\""+h(href)+"\"")
      if (hreflang ne null) ctx.append(" hreflang=\""+h(hreflang)+"\"")
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (rel ne null) ctx.append(" rel=\""+h(rel)+"\"")
      if (rev ne null) ctx.append(" rev=\""+h(rev)+"\"")
      if (shape ne null) ctx.append(" shape=\""+h(shape)+"\"")
      if (target ne null) ctx.append(" target=\""+h(target)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val abbr: ABBR = new ABBR
  final class ABBR extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<abbr>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</abbr>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<abbr")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val address: ADDRESS = new ADDRESS
  final class ADDRESS extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<address>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</address>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<address")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val area: AREA = new AREA
  final class AREA extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<area>") }
    final def apply(alt: String = null, coords: String = null, download: String = null, href: String = null, hreflang: String = null, media: String = null, rel: String = null, shape: String = null, target: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<area")
      if (alt ne null) ctx.append(" alt=\""+h(alt)+"\"")
      if (coords ne null) ctx.append(" coords=\""+h(coords)+"\"")
      if (download ne null) ctx.append(" download=\""+h(download)+"\"")
      if (href ne null) ctx.append(" href=\""+h(href)+"\"")
      if (hreflang ne null) ctx.append(" hreflang=\""+h(hreflang)+"\"")
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (rel ne null) ctx.append(" rel=\""+h(rel)+"\"")
      if (shape ne null) ctx.append(" shape=\""+h(shape)+"\"")
      if (target ne null) ctx.append(" target=\""+h(target)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val article: ARTICLE = new ARTICLE
  final class ARTICLE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<article>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</article>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<article")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val aside: ASIDE = new ASIDE
  final class ASIDE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<aside>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</aside>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<aside")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val audio: AUDIO = new AUDIO
  final class AUDIO extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<audio>") }
    final def apply(controls: String = null, preload: String = null, src: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autoplay: Boolean = false, loop: Boolean = false, muted: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<audio")
      if (controls ne null) ctx.append(" controls=\""+h(controls)+"\"")
      if (preload ne null) ctx.append(" preload=\""+h(preload)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (autoplay) ctx.append(" autoplay")
      if (loop) ctx.append(" loop")
      if (muted) ctx.append(" muted")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val b: B = new B
  final class B extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<b>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</b>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<b")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val base: BASE = new BASE
  final class BASE extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<base>") }
    final def apply(href: String = null, target: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<base")
      if (href ne null) ctx.append(" href=\""+h(href)+"\"")
      if (target ne null) ctx.append(" target=\""+h(target)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val blockquote: BLOCKQUOTE = new BLOCKQUOTE
  final class BLOCKQUOTE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<blockquote>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(cite: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</blockquote>") }
    final def open(cite: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<blockquote")
      ctx.incrementIndent(); 
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val body: BODY = new BODY
  final class BODY extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<body>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</body>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<body")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val br: BR = new BR
  final class BR extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<br>") }
    final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<br")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val button: BUTTON = new BUTTON
  final class BUTTON extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<button>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(form: String = null, formaction: String = null, formenctype: String = null, formmethod: String = null, formtarget: String = null, name: String = null, tpe: String = null, value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, formnovalidate: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(form, formaction, formenctype, formmethod, formtarget, name, tpe, value, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autofocus, disabled, formnovalidate, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</button>") }
    final def open(form: String = null, formaction: String = null, formenctype: String = null, formmethod: String = null, formtarget: String = null, name: String = null, tpe: String = null, value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, formnovalidate: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<button")
      
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (formaction ne null) ctx.append(" formaction=\""+h(formaction)+"\"")
      if (formenctype ne null) ctx.append(" formenctype=\""+h(formenctype)+"\"")
      if (formmethod ne null) ctx.append(" formmethod=\""+h(formmethod)+"\"")
      if (formtarget ne null) ctx.append(" formtarget=\""+h(formtarget)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (autofocus) ctx.append(" autofocus")
      if (disabled) ctx.append(" disabled")
      if (formnovalidate) ctx.append(" formnovalidate")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val canvas: CANVAS = new CANVAS
  final class CANVAS extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<canvas>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(height: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, width, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</canvas>") }
    final def open(height: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<canvas")
      ctx.incrementIndent(); 
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val caption: CAPTION = new CAPTION
  final class CAPTION extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<caption>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</caption>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<caption")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val cite: CITE = new CITE
  final class CITE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<cite>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</cite>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<cite")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val code: CODE = new CODE
  final class CODE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<code>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</code>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<code")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val col: COL = new COL
  final class COL extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<col>") }
    final def apply(span: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<col")
      if (span ne null) ctx.append(" span=\""+h(span)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val colgroup: COLGROUP = new COLGROUP
  final class COLGROUP extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<colgroup>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(span: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(span, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</colgroup>") }
    final def open(span: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<colgroup")
      ctx.incrementIndent(); 
      if (span ne null) ctx.append(" span=\""+h(span)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val command: COMMAND = new COMMAND
  final class COMMAND extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<command>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(icon: String = null, label: String = null, radiogroup: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, checked: Boolean = false, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(icon, label, radiogroup, tpe, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, checked, disabled, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</command>") }
    final def open(icon: String = null, label: String = null, radiogroup: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, checked: Boolean = false, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<command")
      
      if (icon ne null) ctx.append(" icon=\""+h(icon)+"\"")
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (radiogroup ne null) ctx.append(" radiogroup=\""+h(radiogroup)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (checked) ctx.append(" checked")
      if (disabled) ctx.append(" disabled")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val datalist: DATALIST = new DATALIST
  final class DATALIST extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<datalist>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</datalist>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<datalist")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val dd: DD = new DD
  final class DD extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<dd>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</dd>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<dd")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val del: DEL = new DEL
  final class DEL extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<del>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(cite: String = null, datetime: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, datetime, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</del>") }
    final def open(cite: String = null, datetime: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<del")
      
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (datetime ne null) ctx.append(" datetime=\""+h(datetime)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val details: DETAILS = new DETAILS
  final class DETAILS extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<details>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, open: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, open, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</details>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, open: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<details")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (open) ctx.append(" open")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val dfn: DFN = new DFN
  final class DFN extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<dfn>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</dfn>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<dfn")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val dialog: DIALOG = new DIALOG
  final class DIALOG extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<dialog>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, open: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, open, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</dialog>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, open: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<dialog")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (open) ctx.append(" open")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val div: DIV = new DIV
  final class DIV extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<div>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</div>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<div")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val dl: DL = new DL
  final class DL extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<dl>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</dl>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<dl")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val dt: DT = new DT
  final class DT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<dt>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</dt>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<dt")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val em: EM = new EM
  final class EM extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<em>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</em>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<em")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val embed: EMBED = new EMBED
  final class EMBED extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<embed>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(height: String = null, src: String = null, tpe: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, src, tpe, width, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</embed>") }
    final def open(height: String = null, src: String = null, tpe: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<embed")
      ctx.incrementIndent(); 
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val fieldset: FIELDSET = new FIELDSET
  final class FIELDSET extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<fieldset>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(form: String = null, name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(form, name, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, disabled, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</fieldset>") }
    final def open(form: String = null, name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<fieldset")
      ctx.incrementIndent(); 
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (disabled) ctx.append(" disabled")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val figcaption: FIGCAPTION = new FIGCAPTION
  final class FIGCAPTION extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<figcaption>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</figcaption>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<figcaption")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val figure: FIGURE = new FIGURE
  final class FIGURE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<figure>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</figure>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<figure")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val footer: FOOTER = new FOOTER
  final class FOOTER extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<footer>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</footer>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<footer")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val form: FORM = new FORM
  final class FORM extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<form>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(acceptCharset: String = null, action: String = null, autocomplete: String = null, enctype: String = null, method: String = null, name: String = null, target: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, novalidate: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(acceptCharset, action, autocomplete, enctype, method, name, target, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, novalidate, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</form>") }
    final def open(acceptCharset: String = null, action: String = null, autocomplete: String = null, enctype: String = null, method: String = null, name: String = null, target: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, novalidate: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<form")
      ctx.incrementIndent(); 
      if (acceptCharset ne null) ctx.append(" accept-charset=\""+h(acceptCharset)+"\"")
      if (action ne null) ctx.append(" action=\""+h(action)+"\"")
      if (autocomplete ne null) ctx.append(" autocomplete=\""+h(autocomplete)+"\"")
      if (enctype ne null) ctx.append(" enctype=\""+h(enctype)+"\"")
      if (method ne null) ctx.append(" method=\""+h(method)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (target ne null) ctx.append(" target=\""+h(target)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (novalidate) ctx.append(" novalidate")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val head: HEAD = new HEAD
  final class HEAD extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<head>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</head>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<head")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val header: HEADER = new HEADER
  final class HEADER extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<header>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</header>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<header")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val h1: H1 = new H1
  final class H1 extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h1>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h1>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h1")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val h2: H2 = new H2
  final class H2 extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h2>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h2>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h2")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val h3: H3 = new H3
  final class H3 extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h3>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h3>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h3")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val h4: H4 = new H4
  final class H4 extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h4>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h4>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h4")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val h5: H5 = new H5
  final class H5 extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h5>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h5>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h5")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val h6: H6 = new H6
  final class H6 extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h6>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h6>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h6")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val hr: HR = new HR
  final class HR extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<hr>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</hr>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<hr")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val html: HTML = new HTML
  final class HTML extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<html>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(manifest: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(manifest, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</html>") }
    final def open(manifest: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<html")
      ctx.incrementIndent(); 
      if (manifest ne null) ctx.append(" manifest=\""+h(manifest)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val i: I = new I
  final class I extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<i>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</i>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<i")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val iframe: IFRAME = new IFRAME
  final class IFRAME extends Html5Tag {
    @inline final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<iframe>");ctx.incrementIndent(); this.close() }
    
    @inline final def apply(height: String = null, name: String = null, sandbox: String = null, seamless: String = null, src: String = null, srcdoc: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, name, sandbox, seamless, src, srcdoc, width, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs);this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</iframe>") }
    final def open(height: String = null, name: String = null, sandbox: String = null, seamless: String = null, src: String = null, srcdoc: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<iframe")
      ctx.incrementIndent(); 
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (sandbox ne null) ctx.append(" sandbox=\""+h(sandbox)+"\"")
      if (seamless ne null) ctx.append(" seamless=\""+h(seamless)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (srcdoc ne null) ctx.append(" srcdoc=\""+h(srcdoc)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val img: IMG = new IMG
  final class IMG extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<img>") }
    final def apply(alt: String = null, crossorigin: String = null, height: String = null, ismap: String = null, src: String = null, usemap: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<img")
      if (alt ne null) ctx.append(" alt=\""+h(alt)+"\"")
      if (crossorigin ne null) ctx.append(" crossorigin=\""+h(crossorigin)+"\"")
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (ismap ne null) ctx.append(" ismap=\""+h(ismap)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (usemap ne null) ctx.append(" usemap=\""+h(usemap)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val input: INPUT = new INPUT
  final class INPUT extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<input>") }
    final def apply(accept: String = null, alt: String = null, autocomplete: String = null, form: String = null, formaction: String = null, formenctype: String = null, formmethod: String = null, formtarget: String = null, height: String = null, list: String = null, max: String = null, maxlength: String = null, min: String = null, name: String = null, pattern: String = null, placeholder: String = null, size: String = null, src: String = null, step: String = null, tpe: String = null, value: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, checked: Boolean = false, disabled: Boolean = false, formnovalidate: Boolean = false, multiple: Boolean = false, readonly: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<input")
      if (accept ne null) ctx.append(" accept=\""+h(accept)+"\"")
      if (alt ne null) ctx.append(" alt=\""+h(alt)+"\"")
      if (autocomplete ne null) ctx.append(" autocomplete=\""+h(autocomplete)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (formaction ne null) ctx.append(" formaction=\""+h(formaction)+"\"")
      if (formenctype ne null) ctx.append(" formenctype=\""+h(formenctype)+"\"")
      if (formmethod ne null) ctx.append(" formmethod=\""+h(formmethod)+"\"")
      if (formtarget ne null) ctx.append(" formtarget=\""+h(formtarget)+"\"")
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (list ne null) ctx.append(" list=\""+h(list)+"\"")
      if (max ne null) ctx.append(" max=\""+h(max)+"\"")
      if (maxlength ne null) ctx.append(" maxlength=\""+h(maxlength)+"\"")
      if (min ne null) ctx.append(" min=\""+h(min)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (pattern ne null) ctx.append(" pattern=\""+h(pattern)+"\"")
      if (placeholder ne null) ctx.append(" placeholder=\""+h(placeholder)+"\"")
      if (size ne null) ctx.append(" size=\""+h(size)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (step ne null) ctx.append(" step=\""+h(step)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (autofocus) ctx.append(" autofocus")
      if (checked) ctx.append(" checked")
      if (disabled) ctx.append(" disabled")
      if (formnovalidate) ctx.append(" formnovalidate")
      if (multiple) ctx.append(" multiple")
      if (readonly) ctx.append(" readonly")
      if (required) ctx.append(" required")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val ins: INS = new INS
  final class INS extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<ins>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(cite: String = null, datetime: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, datetime, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</ins>") }
    final def open(cite: String = null, datetime: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<ins")
      
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (datetime ne null) ctx.append(" datetime=\""+h(datetime)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val kbd: KBD = new KBD
  final class KBD extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<kbd>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</kbd>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<kbd")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val keygen: KEYGEN = new KEYGEN
  final class KEYGEN extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<keygen>") }
    final def apply(form: String = null, keytype: String = null, name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, challenge: Boolean = false, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<keygen")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (keytype ne null) ctx.append(" keytype=\""+h(keytype)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (autofocus) ctx.append(" autofocus")
      if (challenge) ctx.append(" challenge")
      if (disabled) ctx.append(" disabled")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val label: LABEL = new LABEL
  final class LABEL extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<label>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(`for`: String = null, form: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(`for`, form, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</label>") }
    final def open(`for`: String = null, form: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<label")
      
      if (`for` ne null) ctx.append(" for=\""+h(`for`)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val legend: LEGEND = new LEGEND
  final class LEGEND extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<legend>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</legend>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<legend")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val li: LI = new LI
  final class LI extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<li>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(value, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</li>") }
    final def open(value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<li")
      ctx.incrementIndent(); 
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val link: LINK = new LINK
  final class LINK extends Html5Tag {
    
    final def apply(rel: String, href: String = null, hreflang: String = null, media: String = null, sizes: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<link")
      if (rel ne null) ctx.append(" rel=\""+h(rel)+"\"")
      if (href ne null) ctx.append(" href=\""+h(href)+"\"")
      if (hreflang ne null) ctx.append(" hreflang=\""+h(hreflang)+"\"")
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (sizes ne null) ctx.append(" sizes=\""+h(sizes)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val map: MAP = new MAP
  final class MAP extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<map>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(name, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</map>") }
    final def open(name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<map")
      ctx.incrementIndent(); 
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val mark: MARK = new MARK
  final class MARK extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<mark>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</mark>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<mark")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val menu: MENU = new MENU
  final class MENU extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<menu>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(label: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(label, tpe, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</menu>") }
    final def open(label: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<menu")
      ctx.incrementIndent(); 
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val meta: META = new META
  final class META extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<meta>") }
    final def apply(charset: String = null, content: String = null, httpEquiv: String = null, name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<meta")
      if (charset ne null) ctx.append(" charset=\""+h(charset)+"\"")
      if (content ne null) ctx.append(" content=\""+h(content)+"\"")
      if (httpEquiv ne null) ctx.append(" http-equiv=\""+h(httpEquiv)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val meter: METER = new METER
  final class METER extends Html5Tag {
    
    
    @inline final def apply(value: String, form: String = null, high: String = null, low: String = null, max: String = null, min: String = null, optimum: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(value, form, high, low, max, min, optimum, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</meter>") }
    final def open(value: String, form: String = null, high: String = null, low: String = null, max: String = null, min: String = null, optimum: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<meter")
      
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (high ne null) ctx.append(" high=\""+h(high)+"\"")
      if (low ne null) ctx.append(" low=\""+h(low)+"\"")
      if (max ne null) ctx.append(" max=\""+h(max)+"\"")
      if (min ne null) ctx.append(" min=\""+h(min)+"\"")
      if (optimum ne null) ctx.append(" optimum=\""+h(optimum)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val nav: NAV = new NAV
  final class NAV extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<nav>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</nav>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<nav")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val noscript: NOSCRIPT = new NOSCRIPT
  final class NOSCRIPT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<noscript>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</noscript>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<noscript")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val `object`: OBJECT = new OBJECT
  final class OBJECT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<object>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(data: String = null, form: String = null, height: String = null, name: String = null, tpe: String = null, usermap: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(data, form, height, name, tpe, usermap, width, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</object>") }
    final def open(data: String = null, form: String = null, height: String = null, name: String = null, tpe: String = null, usermap: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<object")
      ctx.incrementIndent(); 
      if (data ne null) ctx.append(" data=\""+h(data)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (usermap ne null) ctx.append(" usermap=\""+h(usermap)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val ol: OL = new OL
  final class OL extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<ol>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(start: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, compact: Boolean = false, reversed: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(start, tpe, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, compact, reversed, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</ol>") }
    final def open(start: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, compact: Boolean = false, reversed: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<ol")
      ctx.incrementIndent(); 
      if (start ne null) ctx.append(" start=\""+h(start)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (compact) ctx.append(" compact")
      if (reversed) ctx.append(" reversed")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val optgroup: OPTGROUP = new OPTGROUP
  final class OPTGROUP extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<optgroup>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(label: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(label, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, disabled, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</optgroup>") }
    final def open(label: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<optgroup")
      ctx.incrementIndent(); 
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (disabled) ctx.append(" disabled")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val option: OPTION = new OPTION
  final class OPTION extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<option>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(label: String = null, value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, selected: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(label, value, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, disabled, selected, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</option>") }
    final def open(label: String = null, value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, selected: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<option")
      ctx.incrementIndent(); 
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (disabled) ctx.append(" disabled")
      if (selected) ctx.append(" selected")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val output: OUTPUT = new OUTPUT
  final class OUTPUT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<output>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(`for`: String = null, form: String = null, name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(`for`, form, name, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</output>") }
    final def open(`for`: String = null, form: String = null, name: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<output")
      ctx.incrementIndent(); 
      if (`for` ne null) ctx.append(" for=\""+h(`for`)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val p: P = new P
  final class P extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<p>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</p>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<p")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val param: PARAM = new PARAM
  final class PARAM extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<param>") }
    final def apply(name: String = null, value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<param")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val pre: PRE = new PRE
  final class PRE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<pre>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</pre>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<pre")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val progress: PROGRESS = new PROGRESS
  final class PROGRESS extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<progress>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(max: String = null, value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(max, value, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</progress>") }
    final def open(max: String = null, value: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<progress")
      
      if (max ne null) ctx.append(" max=\""+h(max)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val q: Q = new Q
  final class Q extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<q>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(cite: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</q>") }
    final def open(cite: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<q")
      
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val rp: RP = new RP
  final class RP extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<rp>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</rp>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<rp")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val rt: RT = new RT
  final class RT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<rt>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</rt>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<rt")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val ruby: RUBY = new RUBY
  final class RUBY extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<ruby>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</ruby>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<ruby")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val s: S = new S
  final class S extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<s>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</s>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<s")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val samp: SAMP = new SAMP
  final class SAMP extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<samp>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</samp>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<samp")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val script: SCRIPT = new SCRIPT
  final class SCRIPT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<script>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(charset: String = null, src: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, async: Boolean = false, defer: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(charset, src, tpe, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, async, defer, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</script>") }
    final def open(charset: String = null, src: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, async: Boolean = false, defer: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<script")
      ctx.incrementIndent(); 
      if (charset ne null) ctx.append(" charset=\""+h(charset)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (async) ctx.append(" async")
      if (defer) ctx.append(" defer")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val section: SECTION = new SECTION
  final class SECTION extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<section>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</section>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<section")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val select: SELECT = new SELECT
  final class SELECT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<select>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(form: String = null, name: String = null, size: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, multiple: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(form, name, size, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autofocus, disabled, multiple, required, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</select>") }
    final def open(form: String = null, name: String = null, size: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, multiple: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<select")
      ctx.incrementIndent(); 
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (size ne null) ctx.append(" size=\""+h(size)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (autofocus) ctx.append(" autofocus")
      if (disabled) ctx.append(" disabled")
      if (multiple) ctx.append(" multiple")
      if (required) ctx.append(" required")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val small: SMALL = new SMALL
  final class SMALL extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<small>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</small>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<small")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val source: SOURCE = new SOURCE
  final class SOURCE extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<source>") }
    final def apply(media: String = null, src: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<source")
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val span: SPAN = new SPAN
  final class SPAN extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<span>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</span>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<span")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val strong: STRONG = new STRONG
  final class STRONG extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<strong>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</strong>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<strong")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val style: STYLE = new STYLE
  final class STYLE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<style>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(media: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, scoped: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(media, tpe, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, scoped, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</style>") }
    final def open(media: String = null, tpe: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, scoped: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<style")
      ctx.incrementIndent(); 
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (scoped) ctx.append(" scoped")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val sub: SUB = new SUB
  final class SUB extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<sub>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</sub>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<sub")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val summary: SUMMARY = new SUMMARY
  final class SUMMARY extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<summary>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</summary>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<summary")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val sup: SUP = new SUP
  final class SUP extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<sup>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</sup>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<sup")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val table: TABLE = new TABLE
  final class TABLE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<table>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(border: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, sortable: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(border, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, sortable, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</table>") }
    final def open(border: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, sortable: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<table")
      ctx.incrementIndent(); 
      if (border ne null) ctx.append(" border=\""+h(border)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (sortable) ctx.append(" sortable")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val tbody: TBODY = new TBODY
  final class TBODY extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<tbody>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</tbody>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<tbody")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val td: TD = new TD
  final class TD extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<td>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(colspan: String = null, rowspan: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(colspan, rowspan, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</td>") }
    final def open(colspan: String = null, rowspan: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<td")
      ctx.incrementIndent(); 
      if (colspan ne null) ctx.append(" colspan=\""+h(colspan)+"\"")
      if (rowspan ne null) ctx.append(" rowspan=\""+h(rowspan)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val textarea: TEXTAREA = new TEXTAREA
  final class TEXTAREA extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<textarea>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(cols: String = null, form: String = null, maxlength: String = null, name: String = null, placeholder: String = null, rows: String = null, wrap: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, readonly: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(cols, form, maxlength, name, placeholder, rows, wrap, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autofocus, disabled, readonly, required, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</textarea>") }
    final def open(cols: String = null, form: String = null, maxlength: String = null, name: String = null, placeholder: String = null, rows: String = null, wrap: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, readonly: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<textarea")
      ctx.incrementIndent(); 
      if (cols ne null) ctx.append(" cols=\""+h(cols)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (maxlength ne null) ctx.append(" maxlength=\""+h(maxlength)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (placeholder ne null) ctx.append(" placeholder=\""+h(placeholder)+"\"")
      if (rows ne null) ctx.append(" rows=\""+h(rows)+"\"")
      if (wrap ne null) ctx.append(" wrap=\""+h(wrap)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (autofocus) ctx.append(" autofocus")
      if (disabled) ctx.append(" disabled")
      if (readonly) ctx.append(" readonly")
      if (required) ctx.append(" required")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val tfoot: TFOOT = new TFOOT
  final class TFOOT extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<tfoot>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</tfoot>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<tfoot")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val th: TH = new TH
  final class TH extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<th>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(abbr: String = null, colspan: String = null, headers: String = null, rowspan: String = null, scope: String = null, sorted: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(abbr, colspan, headers, rowspan, scope, sorted, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</th>") }
    final def open(abbr: String = null, colspan: String = null, headers: String = null, rowspan: String = null, scope: String = null, sorted: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<th")
      ctx.incrementIndent(); 
      if (abbr ne null) ctx.append(" abbr=\""+h(abbr)+"\"")
      if (colspan ne null) ctx.append(" colspan=\""+h(colspan)+"\"")
      if (headers ne null) ctx.append(" headers=\""+h(headers)+"\"")
      if (rowspan ne null) ctx.append(" rowspan=\""+h(rowspan)+"\"")
      if (scope ne null) ctx.append(" scope=\""+h(scope)+"\"")
      if (sorted ne null) ctx.append(" sorted=\""+h(sorted)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val thead: THEAD = new THEAD
  final class THEAD extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<thead>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</thead>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<thead")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val time: TIME = new TIME
  final class TIME extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<time>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(datetime: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(datetime, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</time>") }
    final def open(datetime: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<time")
      
      if (datetime ne null) ctx.append(" datetime=\""+h(datetime)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val title: TITLE = new TITLE
  final class TITLE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<title>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</title>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<title")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val tr: TR = new TR
  final class TR extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<tr>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</tr>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<tr")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val track: TRACK = new TRACK
  final class TRACK extends Html5Tag {
    
    final def apply(src: String, kind: String = null, label: String = null, srclang: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, default: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<track")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (kind ne null) ctx.append(" kind=\""+h(kind)+"\"")
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (srclang ne null) ctx.append(" srclang=\""+h(srclang)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (default) ctx.append(" default")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }

  final val u: U = new U
  final class U extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<u>"); ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</u>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<u")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val ul: UL = new UL
  final class UL extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<ul>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</ul>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<ul")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val variable: VARIABLE = new VARIABLE
  final class VARIABLE extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<variable>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</variable>") }
    final def open(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<variable")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val video: VIDEO = new VIDEO
  final class VIDEO extends Html5Tag {
    @inline final def apply(body: => String)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<video>");ctx.incrementIndent();  ctx.append(h(body)); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply(height: String = null, poster: String = null, preload: String = null, src: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autoplay: Boolean = false, controls: Boolean = false, loop: Boolean = false, muted: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(body: => String)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, poster, preload, src, width, accesskey, clazz, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autoplay, controls, loop, muted, hidden, itemscope, data, aria, attrs); ctx.append(h(body)); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</video>") }
    final def open(height: String = null, poster: String = null, preload: String = null, src: String = null, width: String = null, accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autoplay: Boolean = false, controls: Boolean = false, loop: Boolean = false, muted: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<video")
      ctx.incrementIndent(); 
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (poster ne null) ctx.append(" poster=\""+h(poster)+"\"")
      if (preload ne null) ctx.append(" preload=\""+h(preload)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (autoplay) ctx.append(" autoplay")
      if (controls) ctx.append(" controls")
      if (loop) ctx.append(" loop")
      if (muted) ctx.append(" muted")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
      

  final val wbr: WBR = new WBR
  final class WBR extends Html5Tag {
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<wbr>") }
    final def apply(accesskey: String = null, clazz: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<wbr")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (clazz ne null) ctx.append(" class=\""+h(clazz)+"\"")
      if (contenteditable ne null) ctx.append(" contenteditable=\""+h(contenteditable)+"\"")
      if (contextmenu ne null) ctx.append(" contextmenu=\""+h(contextmenu)+"\"")
      if (dir ne null) ctx.append(" dir=\""+h(dir)+"\"")
      if (draggable ne null) ctx.append(" draggable=\""+h(draggable)+"\"")
      if (dropzone ne null) ctx.append(" dropzone=\""+h(dropzone)+"\"")
      if (id ne null) ctx.append(" id=\""+h(id)+"\"")
      if (lang ne null) ctx.append(" lang=\""+h(lang)+"\"")
      if (spellcheck ne null) ctx.append(" spellcheck=\""+h(spellcheck)+"\"")
      if (style ne null) ctx.append(" style=\""+h(style)+"\"")
      if (tabindex ne null) ctx.append(" tabindex=\""+h(tabindex)+"\"")
      if (title ne null) ctx.append(" title=\""+h(title)+"\"")
      if (translate ne null) ctx.append(" translate=\""+h(translate)+"\"")
      if (role ne null) ctx.append(" role=\""+h(role)+"\"")
      if (itemtype ne null) ctx.append(" itemtype=\""+h(itemtype)+"\"")
      if (itemprop ne null) ctx.append(" itemprop=\""+h(itemprop)+"\"")
      if (onclick ne null) ctx.append(" onclick=\""+h(onclick)+"\"")
      if (hidden) ctx.append(" hidden")
      if (itemscope) ctx.append(" itemscope")
      appendExtra("data-", data)
      appendExtra("aria-", aria)
      appendExtra("", attrs)
      ctx.append(">")
    }
  }
}
