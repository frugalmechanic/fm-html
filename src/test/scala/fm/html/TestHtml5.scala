/*
 * Copyright 2016 Frugal Mechanic (http://frugalmechanic.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fm.html

import org.scalatest.{FunSuite, Matchers}

final class TestHtml5 extends FunSuite with Matchers {
  test("Basic Attribute + Body Test") {
    Html5StringBuilder.captureConcise{ implicit ctx => Html5.DIV(id = "foo") { "bar" } } should equal("""<div id="foo">bar</div>""")
  }

  test("Attributes") {
    Html5StringBuilder.captureConcise{ implicit ctx => Html5.DIV(id = "foo", cls="class", title="Foo & Bar", attrs = Map("non-standard" -> "non & standard"), data = Map("foo" -> "foo & data", "bar" -> "bar & data")) { "bar" } } should equal("""<div class="class" id="foo" title="Foo &amp; Bar" data-foo="foo &amp; data" data-bar="bar &amp; data" non-standard="non &amp; standard">bar</div>""")
  }

  test("Body Test") {
    Html5StringBuilder.captureConcise{ implicit ctx => Html5.DIV() { "bar" } } should equal("""<div>bar</div>""")
  }

  test("No Body Test") {
    Html5StringBuilder.captureConcise{ implicit ctx => Html5.br() } should equal("""<br>""")
  }

  test("Include Blank Attribute Values") {
    Html5StringBuilder.captureConcise{ implicit ctx => Html5.DIV(id = "") { "bar" } } should equal("""<div id="">bar</div>""")
    Html5StringBuilder.captureConcise{ implicit ctx => Html5.DIV(id = "  ") { "bar" } } should equal("""<div id="  ">bar</div>""")
  }

  test("Ignore Null Attribute Values") {
    Html5StringBuilder.captureConcise{ implicit ctx => Html5.DIV(id = null) { "bar" } } should equal("""<div>bar</div>""")
  }
}
