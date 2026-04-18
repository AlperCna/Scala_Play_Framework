package controllers

import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.{Inject, Singleton}
import play.api.mvc._
import play.api.i18n._

@Singleton
class TaskList1 @Inject()(cc: ControllerComponents) extends AbstractController(cc){
   def taskList = Action {
     Ok("This works!")
   }
}
