package controllers

import play.api._
import play.api.mvc._

import views._

object Communities extends Controller {
  
  def index = Action {
    Ok(views.html.Communities.index("Your new application is ready."))
  }
  
}