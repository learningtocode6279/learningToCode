package controllers;

import play.mvc.Http.Request;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.art.art_page;

public class ArtController extends Controller {
	public Result artPage(Request request)
	{
		HomeController.writeLog(request, "art");
		return ok(art_page.render());
	}
}
