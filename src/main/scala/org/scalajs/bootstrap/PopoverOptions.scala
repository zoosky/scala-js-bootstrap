package org.scalajs.bootstrap

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PopoverOptions extends js.Object {
  var animation: Boolean = js.native
  var html: Boolean = js.native
  var placement: String | js.Function = js.native
  var selector: String = js.native
  var trigger: String = js.native
  var title: String | js.Function = js.native
  var template: String = js.native
  var content: js.Any = js.native
  var delay: Double | Object = js.native
  var container: String | Boolean = js.native
  var viewport: String | js.Function | Object = js.native
}