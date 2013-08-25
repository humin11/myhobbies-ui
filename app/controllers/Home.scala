package controllers

import play.api._
import play.api.mvc._

import views._

object Home extends Controller {
  
  def index = Action {
    Ok(views.html.Home.index("Your new application is ready."))
  }
  
}