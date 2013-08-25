package controllers

import play.api._
import play.api.mvc._

import views._

object Ask extends Controller {
  
  def index = Action {
    Ok(views.html.Ask.index("Your new application is ready."))
  }
  
}