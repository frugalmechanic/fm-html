package fm.html

import java.lang.StringBuilder

object Html5StringBuilder {
  def captureConcise(f: Html5RenderCtx => Unit): String = captureImpl(false)(f)
  def captureFormatted(f: Html5RenderCtx => Unit): String = captureImpl(true)(f)

  def capture(f: Html5RenderCtx => Unit): String = captureFormatted(f)

  private def captureImpl(formatted: Boolean)(f: Html5RenderCtx => Unit): String = {
    val builder: Html5StringBuilder = new Html5StringBuilder(formatted)
    f(builder.html5RenderCtx)
    builder.result()
  }
}

final class Html5StringBuilder(formatted: Boolean) extends Html5 {
  private val sb: StringBuilder = new StringBuilder()
  implicit val html5RenderCtx: Html5RenderCtx = if (formatted) new FormattedHtml5RenderCtx(sb) else new ConciseHtml5RenderCtx(sb)
  
  def result(): String = sb.toString()
  def clear(): Unit = sb.setLength(0)
}