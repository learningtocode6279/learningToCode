package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.community.community_page;

public class CommunityController extends Controller
{
	public Result communityPage()
	{
		return ok(community_page.render());
	}
}
