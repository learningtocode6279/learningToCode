package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.art.art_page;

public class ArtController extends Controller {
	public Result artPage()
	{
		return ok(art_page.render());
	}
}
