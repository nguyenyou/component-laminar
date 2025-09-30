package www

import com.raquo.laminar.api.L.*

case class Button() {
  def apply(): HtmlElement = {
    button("Click me")
  }
}