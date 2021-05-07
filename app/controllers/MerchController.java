package controllers;

import play.mvc.Http.Request;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.merch.merch_page;

public class MerchController extends Controller {
	public Result merchPage(Request request)
	{
		HomeController.writeLog(request);
		return ok(merch_page.render());
	}
}
