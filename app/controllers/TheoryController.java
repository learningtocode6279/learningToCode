package controllers;

import play.mvc.Http.Request;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.theory.theory_page;

public class TheoryController extends Controller {
	public Result theoryPage(Request request) {
		HomeController.writeLog(request);
		return ok(theory_page.render());
	}
}
