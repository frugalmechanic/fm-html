package fm.html

import org.apache.commons.text.StringEscapeUtils

object Html5RenderCtx {
  
}

trait Html5RenderCtx {
  def append(s: String): Unit
  def appendOpeningIndent(): Unit
  def appendClosingIndent(): Unit
  def incrementIndent(): Unit
  def decrementIndent(): Unit
  
  def valueToString(v: Any): String = v match {
    case _: Unit => ""// Don't output () for Unit
    case null    => "null"  // null.toString() causes a NullPointerException
    case opt: Option[_] => opt.map{ valueToString }.getOrElse("")
    case arr: Array[_] => arr.map{ valueToString }.mkString(", ")
    case _       => v.toString()
  }

  private[html] final def appendAttribute(name: String, value: String): Unit = {
    // If the value is null then do not output it.
    // Note: If the value is blank we still want to output it since these behave differently:
    //       <option>Unselected</option>          <!-- value defaults to "Unselected" -->
    //       <option value="">Unselected</option> <!-- value is "" -->
    if (value eq null) return

    append(" ")
    append(name)
    append("=\"")
    append(StringEscapeUtils.escapeHtml4(value))
    append("\"")
  }
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
