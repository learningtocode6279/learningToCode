package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.theory.theory_page;

public class TheoryController extends Controller {
	public Result theoryPage() {
		return ok(theory_page.render());
	}
}
