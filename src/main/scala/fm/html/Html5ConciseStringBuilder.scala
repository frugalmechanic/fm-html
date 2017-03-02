package fm.html

import java.lang.StringBuilder

object Html5ConciseStringBuilder {
  def capture(f: Html5RenderCtx => Unit): String = {
    val builder: Html5ConciseStringBuilder = new Html5ConciseStringBuilder
    f(builder.html5RenderCtx)
    builder.result()
  }
}

final class Html5ConciseStringBuilder extends Html5 {
  private val sb: StringBuilder = new StringBuilder()
  implicit val html5RenderCtx: Html5RenderCtx = new ConciseHtml5RenderCtx(sb)

  def result(): String = sb.toString()
  def clear(): Unit = sb.setLength(0)
}