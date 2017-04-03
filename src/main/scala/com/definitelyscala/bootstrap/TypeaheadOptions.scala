package com.definitelyscala.bootstrap

import scala.scalajs.js

@js.native
trait TypeaheadOptions extends js.Object {
  var source: js.Any = js.native
  var items: Double = js.native
  var minLength: Double = js.native
  var matcher: js.Function1[js.Any, Boolean] = js.native
  var sorter: js.Function1[js.Array[js.Any], js.Array[js.Any]] = js.native
  var updater: js.Function1[js.Any, Any] = js.native
  var highlighter: js.Function1[js.Any, String] = js.native
}