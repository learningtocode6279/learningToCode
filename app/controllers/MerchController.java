package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.merch.merch_page;

public class MerchController extends Controller {
	public Result merchPage()
	{
		return ok(merch_page.render());
	}
}
