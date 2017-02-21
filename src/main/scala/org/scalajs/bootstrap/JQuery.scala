package org.scalajs.bootstrap

import scala.scalajs.js

@js.native
trait JQuery extends js.Object {
  def modal(options: ModalOptions): JQuery = js.native
  def modal(options: ModalOptionsBackdropString): JQuery = js.native
  def modal(command: String): JQuery = js.native
  def dropdown(): JQuery = js.native
  def dropdown(command: String): JQuery = js.native
  def scrollspy(command: String): JQuery = js.native
  def scrollspy(options: ScrollSpyOptions): JQuery = js.native
  def tab(): JQuery = js.native
  def tab(command: String): JQuery = js.native
  def tooltip(options: TooltipOptions): JQuery = js.native
  def tooltip(command: String): JQuery = js.native
  def popover(options: PopoverOptions): JQuery = js.native
  def popover(command: String): JQuery = js.native
  def alert(): JQuery = js.native
  def alert(command: String): JQuery = js.native
  def button(): JQuery = js.native
  def button(command: String): JQuery = js.native
  def collapse(options: CollapseOptions): JQuery = js.native
  def collapse(command: String): JQuery = js.native
  def carousel(options: CarouselOptions): JQuery = js.native
  def carousel(command: String): JQuery = js.native
  def typeahead(options: TypeaheadOptions = js.native): JQuery = js.native
  def affix(options: AffixOptions = js.native): JQuery = js.native
  def emulateTransitionEnd(duration: Double): JQuery = js.native
}