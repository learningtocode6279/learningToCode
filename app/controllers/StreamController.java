package controllers;

import play.mvc.Http.Request;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.stream.stream_page;

public class StreamController extends Controller {
	public Result streamPage(Request request)
	{
		HomeController.writeLog(request, "stream");
		return ok(stream_page.render());
	}
}
