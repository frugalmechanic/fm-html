package fm.html

object Html5RenderCtx {
  
}

trait Html5RenderCtx {
  def append(s: String): Unit
  def appendOpeningIndent(): Unit
  def appendClosingIndent(): Unit
  def incrementIndent(): Unit
  def decrementIndent(): Unit
}

final case class ConciseHtml5RenderCtx(out: Appendable) extends Html5RenderCtx {
  def append(s: String): Unit = out.append(s)
  def appendOpeningIndent(): Unit = {}
  def appendClosingIndent(): Unit = {}
  def incrementIndent(): Unit = {}
  def decrementIndent(): Unit = {}
}

final case class FormattedHtml5RenderCtx(out: Appendable) extends Html5RenderCtx {
  private[this] val indent: String = "  "
  private[this] var indentLevel: Int = 0
  private[this] var needClosingNewline: Boolean = false
  private[this] var closingNewlinesStack: List[Boolean] = Nil
  
  def append(s: String): Unit = out.append(s)
  
  def appendOpeningIndent(): Unit = {
    append("\n")
    append(indent * indentLevel)
    if (closingNewlinesStack.nonEmpty) closingNewlinesStack = true :: closingNewlinesStack.tail
  }
  
  def appendClosingIndent(): Unit = {    
    if (needClosingNewline) {
      append("\n")
      append(indent * indentLevel)
    }
  }
  
  def incrementIndent(): Unit = {
    indentLevel += 1
    
    closingNewlinesStack = false :: closingNewlinesStack
  }
  
  def decrementIndent(): Unit = {
    indentLevel -= 1
    
    if (closingNewlinesStack.nonEmpty) {
      needClosingNewline = closingNewlinesStack.head
      closingNewlinesStack = closingNewlinesStack.tail
    } else {
      needClosingNewline = false
    }
  }
}
