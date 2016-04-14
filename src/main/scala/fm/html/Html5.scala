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

trait Html5Tag {
  def accesskey: String
  def cls: String
  def contenteditable: String
  def contextmenu: String
  def dir: String
  def draggable: String
  def dropzone: String
  def id: String
  def lang: String
  def spellcheck: String
  def style: String
  def tabindex: String
  def title: String
  def translate: String
  def role: String
  def itemtype: String
  def itemprop: String
  def onclick: String
  def hidden: Boolean
  def itemscope: Boolean
}

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

  final def capture(f: Html5RenderCtx => Unit): String = {
    val builder: Html5StringBuilder = new Html5StringBuilder
    f(builder.html5RenderCtx)
    builder.result()
  }

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

  final def comment[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = {
    ctx.appendOpeningIndent()
    ctx.append("<!--")
    ctx.incrementIndent()
    val b: String = ctx.valueToString(body)
    if (null != b && b != "") ctx.append(" "+b+" ")
    ctx.decrementIndent()
    ctx.appendClosingIndent()
    ctx.append("-->")
  }

  final def CDATA[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = {
    ctx.append("<![CDATA[")
    ctx.append(ctx.valueToString(body))
    ctx.append("]]>")
  }

  final def DOCTYPE(tpe: String = "html")(implicit ctx: Html5RenderCtx): Unit = ctx.append(s"<!DOCTYPE $tpe>")
    
  final val a: A = A()
  final case class A(charset: String = null, coords: String = null, download: String = null, href: String = null, hreflang: String = null, media: String = null, name: String = null, rel: String = null, rev: String = null, shape: String = null, target: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<a>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](charset: String = self.charset, coords: String = self.coords, download: String = self.download, href: String = self.href, hreflang: String = self.hreflang, media: String = self.media, name: String = self.name, rel: String = self.rel, rev: String = self.rev, shape: String = self.shape, target: String = self.target, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(charset, coords, download, href, hreflang, media, name, rel, rev, shape, target, tpe, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</a>") }
    final def open(charset: String = self.charset, coords: String = self.coords, download: String = self.download, href: String = self.href, hreflang: String = self.hreflang, media: String = self.media, name: String = self.name, rel: String = self.rel, rev: String = self.rev, shape: String = self.shape, target: String = self.target, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val abbr: ABBR = ABBR()
  final case class ABBR(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<abbr>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</abbr>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<abbr")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val address: ADDRESS = ADDRESS()
  final case class ADDRESS(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<address>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</address>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<address")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val area: AREA = AREA()
  final case class AREA(alt: String = null, coords: String = null, download: String = null, href: String = null, hreflang: String = null, media: String = null, rel: String = null, shape: String = null, target: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<area>") }
    final def apply(alt: String = self.alt, coords: String = self.coords, download: String = self.download, href: String = self.href, hreflang: String = self.hreflang, media: String = self.media, rel: String = self.rel, shape: String = self.shape, target: String = self.target, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val article: ARTICLE = ARTICLE()
  final case class ARTICLE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<article>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</article>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<article")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val aside: ASIDE = ASIDE()
  final case class ASIDE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<aside>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</aside>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<aside")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val audio: AUDIO = AUDIO()
  final case class AUDIO(controls: String = null, preload: String = null, src: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autoplay: Boolean = false, loop: Boolean = false, muted: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<audio>") }
    final def apply(controls: String = self.controls, preload: String = self.preload, src: String = self.src, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autoplay: Boolean = self.autoplay, loop: Boolean = self.loop, muted: Boolean = self.muted, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<audio")
      if (controls ne null) ctx.append(" controls=\""+h(controls)+"\"")
      if (preload ne null) ctx.append(" preload=\""+h(preload)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val b: B = B()
  final case class B(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<b>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</b>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<b")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val base: BASE = BASE()
  final case class BASE(href: String = null, target: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<base>") }
    final def apply(href: String = self.href, target: String = self.target, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<base")
      if (href ne null) ctx.append(" href=\""+h(href)+"\"")
      if (target ne null) ctx.append(" target=\""+h(target)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val blockquote: BLOCKQUOTE = BLOCKQUOTE()
  final case class BLOCKQUOTE(cite: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<blockquote>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](cite: String = self.cite, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</blockquote>") }
    final def open(cite: String = self.cite, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<blockquote")
      ctx.incrementIndent(); 
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val body: BODY = BODY()
  final case class BODY(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<body>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</body>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<body")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val br: BR = BR()
  final case class BR(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<br>") }
    final def apply(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<br")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val button: BUTTON = BUTTON()
  final case class BUTTON(form: String = null, formaction: String = null, formenctype: String = null, formmethod: String = null, formtarget: String = null, name: String = null, tpe: String = null, value: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, formnovalidate: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<button>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](form: String = self.form, formaction: String = self.formaction, formenctype: String = self.formenctype, formmethod: String = self.formmethod, formtarget: String = self.formtarget, name: String = self.name, tpe: String = self.tpe, value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, disabled: Boolean = self.disabled, formnovalidate: Boolean = self.formnovalidate, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(form, formaction, formenctype, formmethod, formtarget, name, tpe, value, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autofocus, disabled, formnovalidate, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</button>") }
    final def open(form: String = self.form, formaction: String = self.formaction, formenctype: String = self.formenctype, formmethod: String = self.formmethod, formtarget: String = self.formtarget, name: String = self.name, tpe: String = self.tpe, value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, disabled: Boolean = self.disabled, formnovalidate: Boolean = self.formnovalidate, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val canvas: CANVAS = CANVAS()
  final case class CANVAS(height: String = null, width: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<canvas>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](height: String = self.height, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, width, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</canvas>") }
    final def open(height: String = self.height, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<canvas")
      ctx.incrementIndent(); 
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val caption: CAPTION = CAPTION()
  final case class CAPTION(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<caption>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</caption>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<caption")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val cite: CITE = CITE()
  final case class CITE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<cite>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</cite>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<cite")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val code: CODE = CODE()
  final case class CODE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<code>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</code>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<code")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val col: COL = COL()
  final case class COL(span: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<col>") }
    final def apply(span: String = self.span, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<col")
      if (span ne null) ctx.append(" span=\""+h(span)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val colgroup: COLGROUP = COLGROUP()
  final case class COLGROUP(span: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<colgroup>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](span: String = self.span, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(span, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</colgroup>") }
    final def open(span: String = self.span, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<colgroup")
      ctx.incrementIndent(); 
      if (span ne null) ctx.append(" span=\""+h(span)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val command: COMMAND = COMMAND()
  final case class COMMAND(icon: String = null, label: String = null, radiogroup: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, checked: Boolean = false, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<command>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](icon: String = self.icon, label: String = self.label, radiogroup: String = self.radiogroup, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, checked: Boolean = self.checked, disabled: Boolean = self.disabled, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(icon, label, radiogroup, tpe, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, checked, disabled, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</command>") }
    final def open(icon: String = self.icon, label: String = self.label, radiogroup: String = self.radiogroup, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, checked: Boolean = self.checked, disabled: Boolean = self.disabled, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<command")
      
      if (icon ne null) ctx.append(" icon=\""+h(icon)+"\"")
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (radiogroup ne null) ctx.append(" radiogroup=\""+h(radiogroup)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val datalist: DATALIST = DATALIST()
  final case class DATALIST(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<datalist>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</datalist>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<datalist")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val dd: DD = DD()
  final case class DD(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<dd>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</dd>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<dd")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val del: DEL = DEL()
  final case class DEL(cite: String = null, datetime: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<del>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](cite: String = self.cite, datetime: String = self.datetime, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, datetime, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</del>") }
    final def open(cite: String = self.cite, datetime: String = self.datetime, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<del")
      
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (datetime ne null) ctx.append(" datetime=\""+h(datetime)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val details: DETAILS = DETAILS()
  final case class DETAILS(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, open: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<details>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, open: Boolean = self.open, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, open, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</details>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, open: Boolean = self.open, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<details")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val dfn: DFN = DFN()
  final case class DFN(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<dfn>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</dfn>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<dfn")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val dialog: DIALOG = DIALOG()
  final case class DIALOG(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, open: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<dialog>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, open: Boolean = self.open, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, open, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</dialog>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, open: Boolean = self.open, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<dialog")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val div: DIV = DIV()
  final case class DIV(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<div>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</div>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<div")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val dl: DL = DL()
  final case class DL(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<dl>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</dl>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<dl")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val dt: DT = DT()
  final case class DT(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<dt>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</dt>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<dt")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val em: EM = EM()
  final case class EM(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<em>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</em>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<em")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val embed: EMBED = EMBED()
  final case class EMBED(height: String = null, src: String = null, tpe: String = null, width: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<embed>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](height: String = self.height, src: String = self.src, tpe: String = self.tpe, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, src, tpe, width, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</embed>") }
    final def open(height: String = self.height, src: String = self.src, tpe: String = self.tpe, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<embed")
      ctx.incrementIndent(); 
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val fieldset: FIELDSET = FIELDSET()
  final case class FIELDSET(form: String = null, name: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<fieldset>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](form: String = self.form, name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, disabled: Boolean = self.disabled, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(form, name, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, disabled, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</fieldset>") }
    final def open(form: String = self.form, name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, disabled: Boolean = self.disabled, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<fieldset")
      ctx.incrementIndent(); 
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val figcaption: FIGCAPTION = FIGCAPTION()
  final case class FIGCAPTION(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<figcaption>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</figcaption>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<figcaption")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val figure: FIGURE = FIGURE()
  final case class FIGURE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<figure>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</figure>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<figure")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val footer: FOOTER = FOOTER()
  final case class FOOTER(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<footer>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</footer>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<footer")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val form: FORM = FORM()
  final case class FORM(acceptCharset: String = null, action: String = null, autocomplete: String = null, enctype: String = null, method: String = null, name: String = null, target: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, novalidate: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<form>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](acceptCharset: String = self.acceptCharset, action: String = self.action, autocomplete: String = self.autocomplete, enctype: String = self.enctype, method: String = self.method, name: String = self.name, target: String = self.target, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, novalidate: Boolean = self.novalidate, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(acceptCharset, action, autocomplete, enctype, method, name, target, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, novalidate, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</form>") }
    final def open(acceptCharset: String = self.acceptCharset, action: String = self.action, autocomplete: String = self.autocomplete, enctype: String = self.enctype, method: String = self.method, name: String = self.name, target: String = self.target, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, novalidate: Boolean = self.novalidate, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val head: HEAD = HEAD()
  final case class HEAD(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<head>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</head>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<head")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val header: HEADER = HEADER()
  final case class HEADER(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<header>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</header>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<header")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val h1: H1 = H1()
  final case class H1(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h1>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h1>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h1")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val h2: H2 = H2()
  final case class H2(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h2>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h2>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h2")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val h3: H3 = H3()
  final case class H3(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h3>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h3>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h3")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val h4: H4 = H4()
  final case class H4(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h4>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h4>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h4")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val h5: H5 = H5()
  final case class H5(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h5>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h5>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h5")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val h6: H6 = H6()
  final case class H6(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<h6>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</h6>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<h6")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val hr: HR = HR()
  final case class HR(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<hr>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</hr>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<hr")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val html: HTML = HTML()
  final case class HTML(manifest: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<html>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](manifest: String = self.manifest, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(manifest, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</html>") }
    final def open(manifest: String = self.manifest, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<html")
      ctx.incrementIndent(); 
      if (manifest ne null) ctx.append(" manifest=\""+h(manifest)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val i: I = I()
  final case class I(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<i>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</i>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<i")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val iframe: IFRAME = IFRAME()
  final case class IFRAME(height: String = null, name: String = null, sandbox: String = null, seamless: String = null, src: String = null, srcdoc: String = null, width: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<iframe>");ctx.incrementIndent(); this.close() }
    
    @inline final def apply(height: String = self.height, name: String = self.name, sandbox: String = self.sandbox, seamless: String = self.seamless, src: String = self.src, srcdoc: String = self.srcdoc, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, name, sandbox, seamless, src, srcdoc, width, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs);this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</iframe>") }
    final def open(height: String = self.height, name: String = self.name, sandbox: String = self.sandbox, seamless: String = self.seamless, src: String = self.src, srcdoc: String = self.srcdoc, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val img: IMG = IMG()
  final case class IMG(alt: String = null, crossorigin: String = null, height: String = null, ismap: String = null, src: String = null, usemap: String = null, width: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<img>") }
    final def apply(alt: String = self.alt, crossorigin: String = self.crossorigin, height: String = self.height, ismap: String = self.ismap, src: String = self.src, usemap: String = self.usemap, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<img")
      if (alt ne null) ctx.append(" alt=\""+h(alt)+"\"")
      if (crossorigin ne null) ctx.append(" crossorigin=\""+h(crossorigin)+"\"")
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (ismap ne null) ctx.append(" ismap=\""+h(ismap)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (usemap ne null) ctx.append(" usemap=\""+h(usemap)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val input: INPUT = INPUT()
  final case class INPUT(accept: String = null, alt: String = null, autocomplete: String = null, form: String = null, formaction: String = null, formenctype: String = null, formmethod: String = null, formtarget: String = null, height: String = null, list: String = null, max: String = null, maxlength: String = null, min: String = null, name: String = null, pattern: String = null, placeholder: String = null, size: String = null, src: String = null, step: String = null, tpe: String = null, value: String = null, width: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, checked: Boolean = false, disabled: Boolean = false, formnovalidate: Boolean = false, multiple: Boolean = false, readonly: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<input>") }
    final def apply(accept: String = self.accept, alt: String = self.alt, autocomplete: String = self.autocomplete, form: String = self.form, formaction: String = self.formaction, formenctype: String = self.formenctype, formmethod: String = self.formmethod, formtarget: String = self.formtarget, height: String = self.height, list: String = self.list, max: String = self.max, maxlength: String = self.maxlength, min: String = self.min, name: String = self.name, pattern: String = self.pattern, placeholder: String = self.placeholder, size: String = self.size, src: String = self.src, step: String = self.step, tpe: String = self.tpe, value: String = self.value, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, checked: Boolean = self.checked, disabled: Boolean = self.disabled, formnovalidate: Boolean = self.formnovalidate, multiple: Boolean = self.multiple, readonly: Boolean = self.readonly, required: Boolean = self.required, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val ins: INS = INS()
  final case class INS(cite: String = null, datetime: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<ins>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](cite: String = self.cite, datetime: String = self.datetime, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, datetime, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</ins>") }
    final def open(cite: String = self.cite, datetime: String = self.datetime, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<ins")
      
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (datetime ne null) ctx.append(" datetime=\""+h(datetime)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val kbd: KBD = KBD()
  final case class KBD(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<kbd>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</kbd>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<kbd")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val keygen: KEYGEN = KEYGEN()
  final case class KEYGEN(form: String = null, keytype: String = null, name: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, challenge: Boolean = false, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<keygen>") }
    final def apply(form: String = self.form, keytype: String = self.keytype, name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, challenge: Boolean = self.challenge, disabled: Boolean = self.disabled, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<keygen")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (keytype ne null) ctx.append(" keytype=\""+h(keytype)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val label: LABEL = LABEL()
  final case class LABEL(`for`: String = null, form: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<label>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](`for`: String = self.`for`, form: String = self.form, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(`for`, form, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</label>") }
    final def open(`for`: String = self.`for`, form: String = self.form, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<label")
      
      if (`for` ne null) ctx.append(" for=\""+h(`for`)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val legend: LEGEND = LEGEND()
  final case class LEGEND(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<legend>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</legend>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<legend")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val li: LI = LI()
  final case class LI(value: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<li>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(value, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</li>") }
    final def open(value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<li")
      ctx.incrementIndent(); 
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val link: LINK = LINK()
  final case class LINK(rel: String = null, href: String = null, hreflang: String = null, media: String = null, sizes: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    
    final def apply(rel: String = self.rel, href: String = self.href, hreflang: String = self.hreflang, media: String = self.media, sizes: String = self.sizes, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<link")
      if (rel ne null) ctx.append(" rel=\""+h(rel)+"\"")
      if (href ne null) ctx.append(" href=\""+h(href)+"\"")
      if (hreflang ne null) ctx.append(" hreflang=\""+h(hreflang)+"\"")
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (sizes ne null) ctx.append(" sizes=\""+h(sizes)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val map: MAP = MAP()
  final case class MAP(name: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<map>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(name, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</map>") }
    final def open(name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<map")
      ctx.incrementIndent(); 
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val mark: MARK = MARK()
  final case class MARK(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<mark>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</mark>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<mark")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val menu: MENU = MENU()
  final case class MENU(label: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<menu>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](label: String = self.label, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(label, tpe, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</menu>") }
    final def open(label: String = self.label, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<menu")
      ctx.incrementIndent(); 
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val meta: META = META()
  final case class META(charset: String = null, content: String = null, httpEquiv: String = null, name: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<meta>") }
    final def apply(charset: String = self.charset, content: String = self.content, httpEquiv: String = self.httpEquiv, name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<meta")
      if (charset ne null) ctx.append(" charset=\""+h(charset)+"\"")
      if (content ne null) ctx.append(" content=\""+h(content)+"\"")
      if (httpEquiv ne null) ctx.append(" http-equiv=\""+h(httpEquiv)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val meter: METER = METER()
  final case class METER(value: String = null, form: String = null, high: String = null, low: String = null, max: String = null, min: String = null, optimum: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    
    
    @inline final def apply[T](value: String = self.value, form: String = self.form, high: String = self.high, low: String = self.low, max: String = self.max, min: String = self.min, optimum: String = self.optimum, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(value, form, high, low, max, min, optimum, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</meter>") }
    final def open(value: String = self.value, form: String = self.form, high: String = self.high, low: String = self.low, max: String = self.max, min: String = self.min, optimum: String = self.optimum, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<meter")
      
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (high ne null) ctx.append(" high=\""+h(high)+"\"")
      if (low ne null) ctx.append(" low=\""+h(low)+"\"")
      if (max ne null) ctx.append(" max=\""+h(max)+"\"")
      if (min ne null) ctx.append(" min=\""+h(min)+"\"")
      if (optimum ne null) ctx.append(" optimum=\""+h(optimum)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val nav: NAV = NAV()
  final case class NAV(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<nav>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</nav>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<nav")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val noscript: NOSCRIPT = NOSCRIPT()
  final case class NOSCRIPT(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<noscript>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</noscript>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<noscript")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val `object`: OBJECT = OBJECT()
  final case class OBJECT(data: String = null, form: String = null, height: String = null, name: String = null, tpe: String = null, usermap: String = null, width: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<object>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](data: String = self.data, form: String = self.form, height: String = self.height, name: String = self.name, tpe: String = self.tpe, usermap: String = self.usermap, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(data, form, height, name, tpe, usermap, width, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</object>") }
    final def open(data: String = self.data, form: String = self.form, height: String = self.height, name: String = self.name, tpe: String = self.tpe, usermap: String = self.usermap, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val ol: OL = OL()
  final case class OL(start: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, compact: Boolean = false, reversed: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<ol>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](start: String = self.start, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, compact: Boolean = self.compact, reversed: Boolean = self.reversed, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(start, tpe, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, compact, reversed, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</ol>") }
    final def open(start: String = self.start, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, compact: Boolean = self.compact, reversed: Boolean = self.reversed, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<ol")
      ctx.incrementIndent(); 
      if (start ne null) ctx.append(" start=\""+h(start)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val optgroup: OPTGROUP = OPTGROUP()
  final case class OPTGROUP(label: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<optgroup>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](label: String = self.label, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, disabled: Boolean = self.disabled, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(label, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, disabled, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</optgroup>") }
    final def open(label: String = self.label, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, disabled: Boolean = self.disabled, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<optgroup")
      ctx.incrementIndent(); 
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val option: OPTION = OPTION()
  final case class OPTION(label: String = null, value: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, disabled: Boolean = false, selected: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<option>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](label: String = self.label, value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, disabled: Boolean = self.disabled, selected: Boolean = self.selected, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(label, value, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, disabled, selected, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</option>") }
    final def open(label: String = self.label, value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, disabled: Boolean = self.disabled, selected: Boolean = self.selected, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<option")
      ctx.incrementIndent(); 
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val output: OUTPUT = OUTPUT()
  final case class OUTPUT(`for`: String = null, form: String = null, name: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<output>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](`for`: String = self.`for`, form: String = self.form, name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(`for`, form, name, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</output>") }
    final def open(`for`: String = self.`for`, form: String = self.form, name: String = self.name, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<output")
      ctx.incrementIndent(); 
      if (`for` ne null) ctx.append(" for=\""+h(`for`)+"\"")
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val p: P = P()
  final case class P(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<p>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</p>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<p")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val param: PARAM = PARAM()
  final case class PARAM(name: String = null, value: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<param>") }
    final def apply(name: String = self.name, value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<param")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val pre: PRE = PRE()
  final case class PRE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<pre>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</pre>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<pre")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val progress: PROGRESS = PROGRESS()
  final case class PROGRESS(max: String = null, value: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<progress>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](max: String = self.max, value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(max, value, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</progress>") }
    final def open(max: String = self.max, value: String = self.value, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<progress")
      
      if (max ne null) ctx.append(" max=\""+h(max)+"\"")
      if (value ne null) ctx.append(" value=\""+h(value)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val q: Q = Q()
  final case class Q(cite: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<q>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](cite: String = self.cite, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(cite, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</q>") }
    final def open(cite: String = self.cite, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<q")
      
      if (cite ne null) ctx.append(" cite=\""+h(cite)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val rp: RP = RP()
  final case class RP(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<rp>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</rp>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<rp")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val rt: RT = RT()
  final case class RT(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<rt>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</rt>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<rt")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val ruby: RUBY = RUBY()
  final case class RUBY(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<ruby>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</ruby>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<ruby")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val s: S = S()
  final case class S(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<s>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</s>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<s")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val samp: SAMP = SAMP()
  final case class SAMP(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<samp>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</samp>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<samp")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val script: SCRIPT = SCRIPT()
  final case class SCRIPT(charset: String = null, src: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, async: Boolean = false, defer: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<script>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](charset: String = self.charset, src: String = self.src, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, async: Boolean = self.async, defer: Boolean = self.defer, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(charset, src, tpe, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, async, defer, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</script>") }
    final def open(charset: String = self.charset, src: String = self.src, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, async: Boolean = self.async, defer: Boolean = self.defer, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<script")
      ctx.incrementIndent(); 
      if (charset ne null) ctx.append(" charset=\""+h(charset)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val section: SECTION = SECTION()
  final case class SECTION(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<section>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</section>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<section")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val select: SELECT = SELECT()
  final case class SELECT(form: String = null, name: String = null, size: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, multiple: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<select>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](form: String = self.form, name: String = self.name, size: String = self.size, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, disabled: Boolean = self.disabled, multiple: Boolean = self.multiple, required: Boolean = self.required, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(form, name, size, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autofocus, disabled, multiple, required, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</select>") }
    final def open(form: String = self.form, name: String = self.name, size: String = self.size, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, disabled: Boolean = self.disabled, multiple: Boolean = self.multiple, required: Boolean = self.required, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<select")
      ctx.incrementIndent(); 
      if (form ne null) ctx.append(" form=\""+h(form)+"\"")
      if (name ne null) ctx.append(" name=\""+h(name)+"\"")
      if (size ne null) ctx.append(" size=\""+h(size)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val small: SMALL = SMALL()
  final case class SMALL(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<small>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</small>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<small")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val source: SOURCE = SOURCE()
  final case class SOURCE(media: String = null, src: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<source>") }
    final def apply(media: String = self.media, src: String = self.src, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<source")
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val span: SPAN = SPAN()
  final case class SPAN(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<span>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</span>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<span")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val strong: STRONG = STRONG()
  final case class STRONG(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<strong>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</strong>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<strong")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val style: STYLE = STYLE()
  final case class STYLE(media: String = null, tpe: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, scoped: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<style>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](media: String = self.media, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, scoped: Boolean = self.scoped, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(media, tpe, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, scoped, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</style>") }
    final def open(media: String = self.media, tpe: String = self.tpe, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, scoped: Boolean = self.scoped, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<style")
      ctx.incrementIndent(); 
      if (media ne null) ctx.append(" media=\""+h(media)+"\"")
      if (tpe ne null) ctx.append(" type=\""+h(tpe)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val sub: SUB = SUB()
  final case class SUB(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<sub>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</sub>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<sub")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val summary: SUMMARY = SUMMARY()
  final case class SUMMARY(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<summary>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</summary>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<summary")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val sup: SUP = SUP()
  final case class SUP(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<sup>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</sup>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<sup")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val table: TABLE = TABLE()
  final case class TABLE(border: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, sortable: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<table>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](border: String = self.border, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, sortable: Boolean = self.sortable, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(border, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, sortable, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</table>") }
    final def open(border: String = self.border, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, sortable: Boolean = self.sortable, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<table")
      ctx.incrementIndent(); 
      if (border ne null) ctx.append(" border=\""+h(border)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val tbody: TBODY = TBODY()
  final case class TBODY(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<tbody>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</tbody>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<tbody")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val td: TD = TD()
  final case class TD(colspan: String = null, rowspan: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<td>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](colspan: String = self.colspan, rowspan: String = self.rowspan, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(colspan, rowspan, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</td>") }
    final def open(colspan: String = self.colspan, rowspan: String = self.rowspan, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<td")
      ctx.incrementIndent(); 
      if (colspan ne null) ctx.append(" colspan=\""+h(colspan)+"\"")
      if (rowspan ne null) ctx.append(" rowspan=\""+h(rowspan)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val textarea: TEXTAREA = TEXTAREA()
  final case class TEXTAREA(cols: String = null, form: String = null, maxlength: String = null, name: String = null, placeholder: String = null, rows: String = null, wrap: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autofocus: Boolean = false, disabled: Boolean = false, readonly: Boolean = false, required: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<textarea>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](cols: String = self.cols, form: String = self.form, maxlength: String = self.maxlength, name: String = self.name, placeholder: String = self.placeholder, rows: String = self.rows, wrap: String = self.wrap, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, disabled: Boolean = self.disabled, readonly: Boolean = self.readonly, required: Boolean = self.required, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(cols, form, maxlength, name, placeholder, rows, wrap, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autofocus, disabled, readonly, required, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</textarea>") }
    final def open(cols: String = self.cols, form: String = self.form, maxlength: String = self.maxlength, name: String = self.name, placeholder: String = self.placeholder, rows: String = self.rows, wrap: String = self.wrap, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autofocus: Boolean = self.autofocus, disabled: Boolean = self.disabled, readonly: Boolean = self.readonly, required: Boolean = self.required, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val tfoot: TFOOT = TFOOT()
  final case class TFOOT(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<tfoot>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</tfoot>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<tfoot")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val th: TH = TH()
  final case class TH(abbr: String = null, colspan: String = null, headers: String = null, rowspan: String = null, scope: String = null, sorted: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<th>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](abbr: String = self.abbr, colspan: String = self.colspan, headers: String = self.headers, rowspan: String = self.rowspan, scope: String = self.scope, sorted: String = self.sorted, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(abbr, colspan, headers, rowspan, scope, sorted, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</th>") }
    final def open(abbr: String = self.abbr, colspan: String = self.colspan, headers: String = self.headers, rowspan: String = self.rowspan, scope: String = self.scope, sorted: String = self.sorted, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
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
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val thead: THEAD = THEAD()
  final case class THEAD(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<thead>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</thead>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<thead")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val time: TIME = TIME()
  final case class TIME(datetime: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<time>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](datetime: String = self.datetime, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(datetime, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</time>") }
    final def open(datetime: String = self.datetime, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<time")
      
      if (datetime ne null) ctx.append(" datetime=\""+h(datetime)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val title: TITLE = TITLE()
  final case class TITLE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<title>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</title>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<title")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val tr: TR = TR()
  final case class TR(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<tr>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</tr>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<tr")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val track: TRACK = TRACK()
  final case class TRACK(src: String = null, kind: String = null, label: String = null, srclang: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, default: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    
    final def apply(src: String = self.src, kind: String = self.kind, label: String = self.label, srclang: String = self.srclang, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, default: Boolean = self.default, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<track")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (kind ne null) ctx.append(" kind=\""+h(kind)+"\"")
      if (label ne null) ctx.append(" label=\""+h(label)+"\"")
      if (srclang ne null) ctx.append(" srclang=\""+h(srclang)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  final val u: U = U()
  final case class U(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<u>"); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.append("</u>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<u")
      
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val ul: UL = UL()
  final case class UL(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<ul>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</ul>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<ul")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val variable: VARIABLE = VARIABLE()
  final case class VARIABLE(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<variable>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</variable>") }
    final def open(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<variable")
      ctx.incrementIndent(); 
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val video: VIDEO = VIDEO()
  final case class VIDEO(height: String = null, poster: String = null, preload: String = null, src: String = null, width: String = null, accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, autoplay: Boolean = false, controls: Boolean = false, loop: Boolean = false, muted: Boolean = false, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    @inline final def apply[T](body: => T)(implicit ctx: Html5RenderCtx): Unit = { ctx.appendOpeningIndent(); ctx.append("<video>");ctx.incrementIndent();  ctx.append(h(ctx.valueToString(body))); this.close() }
    final def apply()(implicit ctx: Html5RenderCtx): Unit = apply("")
    @inline final def apply[T](height: String = self.height, poster: String = self.poster, preload: String = self.preload, src: String = self.src, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autoplay: Boolean = self.autoplay, controls: Boolean = self.controls, loop: Boolean = self.loop, muted: Boolean = self.muted, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(body: => T)(implicit ctx: Html5RenderCtx): Unit = { this.open(height, poster, preload, src, width, accesskey, cls, contenteditable, contextmenu, dir, draggable, dropzone, id, lang, spellcheck, style, tabindex, title, translate, role, itemtype, itemprop, onclick, autoplay, controls, loop, muted, hidden, itemscope, data, aria, attrs); ctx.append(h(ctx.valueToString(body))); this.close() }
    final def close()(implicit ctx: Html5RenderCtx): Unit = { ctx.decrementIndent(); ctx.appendClosingIndent(); ctx.append("</video>") }
    final def open(height: String = self.height, poster: String = self.poster, preload: String = self.preload, src: String = self.src, width: String = self.width, accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, autoplay: Boolean = self.autoplay, controls: Boolean = self.controls, loop: Boolean = self.loop, muted: Boolean = self.muted, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      ctx.appendOpeningIndent(); 
      ctx.append("<video")
      ctx.incrementIndent(); 
      if (height ne null) ctx.append(" height=\""+h(height)+"\"")
      if (poster ne null) ctx.append(" poster=\""+h(poster)+"\"")
      if (preload ne null) ctx.append(" preload=\""+h(preload)+"\"")
      if (src ne null) ctx.append(" src=\""+h(src)+"\"")
      if (width ne null) ctx.append(" width=\""+h(width)+"\"")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
      
  final val wbr: WBR = WBR()
  final case class WBR(accesskey: String = null, cls: String = null, contenteditable: String = null, contextmenu: String = null, dir: String = null, draggable: String = null, dropzone: String = null, id: String = null, lang: String = null, spellcheck: String = null, style: String = null, tabindex: String = null, title: String = null, translate: String = null, role: String = null, itemtype: String = null, itemprop: String = null, onclick: String = null, hidden: Boolean = false, itemscope: Boolean = false, data: Map[String,String] = Map.empty, aria: Map[String,String] = Map.empty, attrs: Map[String,String] = Map.empty) extends Html5Tag { self =>
    final def apply(implicit ctx: Html5RenderCtx): Unit = { ctx.append("<wbr>") }
    final def apply(accesskey: String = self.accesskey, cls: String = self.cls, contenteditable: String = self.contenteditable, contextmenu: String = self.contextmenu, dir: String = self.dir, draggable: String = self.draggable, dropzone: String = self.dropzone, id: String = self.id, lang: String = self.lang, spellcheck: String = self.spellcheck, style: String = self.style, tabindex: String = self.tabindex, title: String = self.title, translate: String = self.translate, role: String = self.role, itemtype: String = self.itemtype, itemprop: String = self.itemprop, onclick: String = self.onclick, hidden: Boolean = self.hidden, itemscope: Boolean = self.itemscope, data: Map[String,String] = self.data, aria: Map[String,String] = self.aria, attrs: Map[String,String] = self.attrs)(implicit ctx: Html5RenderCtx): Unit = {
      
      ctx.append("<wbr")
      if (accesskey ne null) ctx.append(" accesskey=\""+h(accesskey)+"\"")
      if (cls ne null) ctx.append(" class=\""+h(cls)+"\"")
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
  }}