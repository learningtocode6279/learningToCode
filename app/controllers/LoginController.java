package controllers;

import play.mvc.Http.Request;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login.login_page;

public class LoginController extends Controller {
	public Result loginPage(Request request)
	{
		HomeController.writeLog(request);
		return ok(login_page.render());
	}
}
