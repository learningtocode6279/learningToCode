package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.stream.stream_page;

public class StreamController extends Controller {
	public Result streamPage()
	{
		return ok(stream_page.render());
	}
}
