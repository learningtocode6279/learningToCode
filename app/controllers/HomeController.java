package controllers;

import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;
import views.html.info.contact_page;
import views.html.info.index;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	/**
	 * An action that renders an HTML page with a welcome message.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/</code>.
	 */
	public Result index(Request request) {
		writeLog(request, "Media");
		return ok(index.render());
	}

	public Result contactPage(Request request){
		writeLog(request, "Contact");
		return ok(contact_page.render());
	}

	public static final DateTimeFormatter formatter = DateTimeFormatter
			.ofPattern("yyyy-MM-dd'T'HH:mm:ss")
			.withZone(ZoneId.systemDefault());

	public static synchronized void writeLog(Request request, String page)
	{
		String remoteAddress = request.remoteAddress();
		String time = formatter.format(Instant.now());
		String row = String.join(" \t ", remoteAddress, time, page);
		System.out.println(row);
	}
}
