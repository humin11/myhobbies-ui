package controllers

import play.api._
import play.api.mvc._

import views._

object Blog extends Controller {
  
  def index = Action {
    Ok(views.html.Blog.index("Your new application is ready."))
  }
  
}