package fm.html

object Html5StringBuilder {
  def capture(f: Html5RenderCtx => Unit): String = {
    val builder = new Html5StringBuilder
    f(builder.html5RenderCtx)
    builder.result()
  }
}

final class Html5StringBuilder extends Html5 {
  private val sb = new java.lang.StringBuilder()
  implicit val html5RenderCtx: Html5RenderCtx = new FormattedHtml5RenderCtx(sb)
  
  def result(): String = sb.toString()
  def clear(): Unit = sb.setLength(0)
}