package edu.csupomona.cs480.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.base.Joiner;

import org.apache.commons.math.stat.DescriptiveStatistics;
import org.apache.commons.math.stat.SummaryStatistics;

import edu.csupomona.cs480.App;
import edu.csupomona.cs480.data.Event;
import edu.csupomona.cs480.data.User;
import edu.csupomona.cs480.data.provider.EventManager;
import edu.csupomona.cs480.data.provider.UserManager;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import net.time4j.*;
import net.time4j.format.TextWidth;
import static net.time4j.CalendarUnit.MONTHS;
import static net.time4j.PlainDate.DAY_OF_MONTH;
import static net.time4j.PlainDate.DAY_OF_WEEK;
import static net.time4j.PlainTime.MINUTE_OF_HOUR;
import static net.time4j.Weekday.WEDNESDAY;


/**
 * This is the controller used by Spring framework.
 * <p>
 * The basic function of this controller is to map
 * each HTTP API Path to the correspondent method.
 *
 */

@RestController
public class WebController {

	/**
	 * When the class instance is annotated with
	 * {@link Autowired}, it will be looking for the actual
	 * instance from the defined beans.
	 * <p>
	 * In our project, all the beans are defined in
	 * the {@link App} class.
	 */
	@Autowired
	private UserManager userManager;
	
	@Autowired
	private EventManager eventManager;

	/**
	 * This is a simple example of how the HTTP API works.
	 * It returns a String "OK" in the HTTP response.
	 * To try it, run the web application locally,
	 * in your web browser, type the link:
	 * 	http://localhost:8080/cs480/ping
	 */
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	String healthCheck() {
		// You can replace this with other string,
		// and run the application locally to check your changes
		// with the URL: http://localhost:8080/
		return "OK";
	}

	/**
	 * This is a simple example of how to use a data manager
	 * to retrieve the data and return it as an HTTP response.
	 * <p>
	 * Note, when it returns from the Spring, it will be
	 * automatically converted to JSON format.
	 * <p>
	 * Try it in your web browser:
	 * 	http://localhost:8080/cs480/users/user101
	 */
	@RequestMapping(value = "/users/{userID}", method = RequestMethod.GET)
	User getUser(@PathVariable("userID") String userID) {
		User user = userManager.getUser(userID);
		return user;
	}
	
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.GET)
	Event getEvent(@PathVariable("eventID") String eventID) {
		Event event = eventManager.getEvent(eventID);
		return event;
	}
	
	@RequestMapping(value = "/login/{userID}", method = RequestMethod.GET)
	User getUserLogin(@PathVariable("userID") String userID,
					 @RequestParam("password") String pass) {
		User user = userManager.getUser(userID);
		if (user.getPassword().equals(pass)) {
			return user;
		}
		return null;
	}

	/**
	 * This is an example of sending an HTTP POST request to
	 * update a user's information (or create the user if not
	 * exists before).
	 *
	 * You can test this with a HTTP client by sending
	 *  http://localhost:8080/cs480/user/user101
	 *  	name=John major=CS
	 *
	 * Note, the URL will not work directly in browser, because
	 * it is not a GET request. You need to use a tool such as
	 * curl.
	 *
	 * @param id
	 * @param name
	 * @param password
	 * @param phone
	 * @return
	 */
	@RequestMapping(value = "/users/{userID}", method = RequestMethod.POST)
	User updateUser(
			@PathVariable("userID") String id,
			@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("phone") String phone) {
		User user = new User();
		user.setUserID(id);
		user.setName(name);
		user.setPassword(password);
		user.setPhone(phone);
		userManager.updateUser(user);
		return user;
	}
	
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.POST)
	Event updateEvent(
			@PathVariable("eventID") String id,
			@RequestParam("event_name") String name,
			@RequestParam("location") String location,
			@RequestParam("date") String date,
			@RequestParam("start_time") String start,
			@RequestParam("end_time") String end) {
		Event event = new Event();
		event.setEventID(id);
		event.setName(name);
		event.setLocation(location);
		event.setDate(date);
		event.setStart_time(start);
		event.setEnd_time(end);
		eventManager.updateEvent(event);
		return event;
	}
	
	// update the driver of the event
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.POST, params = "driver")
	Event updateDriverEvent(
			@PathVariable("eventID") String id,
			@RequestParam("driver") String driver) {
		Event event = eventManager.getEvent(id);
		event.setDriver(driver);
		eventManager.updateEvent(event);
		return event;
	}
	
	// update the passengers of the event
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.POST, params = "p1")
	Event updateP1Event(
			@PathVariable("eventID") String id,
			@RequestParam("p1") String pass) {
		Event event = eventManager.getEvent(id);
		event.setP1(pass);
		eventManager.updateEvent(event);
		return event;
	}
	
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.POST, params = "p2")
	Event updateP2Event(
			@PathVariable("eventID") String id,
			@RequestParam("p2") String pass) {
		Event event = eventManager.getEvent(id);
		event.setP2(pass);
		eventManager.updateEvent(event);
		return event;
	}
	
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.POST, params = "p3")
	Event updateP3Event(
			@PathVariable("eventID") String id,
			@RequestParam("p3") String pass) {
		Event event = eventManager.getEvent(id);
		event.setP3(pass);
		eventManager.updateEvent(event);
		return event;
	}
	
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.POST, params = "p4")
	Event updateP4Event(
			@PathVariable("eventID") String id,
			@RequestParam("p4") String pass) {
		Event event = eventManager.getEvent(id);
		event.setP4(pass);
		eventManager.updateEvent(event);
		return event;
	}
	
	@RequestMapping(value = "/login/{userID}", method = RequestMethod.POST)
	User updateUserLogin(
			@PathVariable("userID") String id,
			@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("phone") String phone) {
		User user = new User();
		user.setUserID(id);
		user.setName(name);
		user.setPassword(password);
		user.setPhone(phone);
		userManager.updateUser(user);
		return user;
	}
	
/*	@RequestMapping(value = "/cs480/john", method = RequestMethod.GET)
	double john() {
		// You can replace this with other string,
		// and run the application locally to check your changes
		// with the URL: http://localhost:8080/
		//return "Testing seperate pings.";
		DescriptiveStatistics stats = new DescriptiveStatistics();
		int[] inputArray = new int[9];
		
		for( int i = 0; i < 10; i++) {
				stats.addValue(inputArray[i]);
		}

		// Compute some statistics
		 double mean = stats.getMean();
		 return mean;
	}
	
	// changing to use Joiner from google guava
	@RequestMapping(value = "/cs480/nicole", method = RequestMethod.GET)
	String nicoleSecretText() {
		// will join specified parameters with specified joiner
		Joiner joiner = Joiner.on(" | ").skipNulls();
		return joiner.join("Nicole", "Loves", null, "Chicken", "Nuggets", null);
	}
*/
	@RequestMapping(value = "/nandita", method = RequestMethod.GET)
	public static
	String nandita() throws IOException {
		Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
		Elements newsHeadlines = doc.select("#mp-itn b a");
		return ("LATEST NEWS HEADLINES" + "\n" + newsHeadlines);
	}
	
/*	@RequestMapping(value = "/cs480/gretchen", method = RequestMethod.GET)
	String gretchysString() {
		PlainDate today = SystemClock.inLocalView().today();
		PlainDate nextWednesday = today.with(DAY_OF_WEEK.setToNext(WEDNESDAY));
		
		return "When is next Wednesday?? " + nextWednesday;
	}*/
	
	/**
	 * This API deletes the user. It uses HTTP DELETE method.
	 *
	 * @param userId
	 */
	@RequestMapping(value = "/users/{userID}", method = RequestMethod.DELETE)
	void deleteUser(
			@PathVariable("userID") String userID) {
		userManager.deleteUser(userID);
	}
	
	@RequestMapping(value = "/event/{eventID}", method = RequestMethod.DELETE)
	void deleteEvent(
			@PathVariable("eventID") String eventID) {
		eventManager.deleteEvent(eventID);
	}
	
	@RequestMapping(value = "/login/{userID}", method = RequestMethod.DELETE)
	void deleteUserLogin(
			@PathVariable("userID") String userID) {
		userManager.deleteUser(userID);
	}

	/**
	 * This API lists all the users in the current database.
	 *
	 * @return
	 */
	@RequestMapping(value = "/users/list", method = RequestMethod.GET)
	List<User> listAllUsers() {
		return userManager.listAllUsers();
	}
	
	@RequestMapping(value = "/events/list", method = RequestMethod.GET)
	List<Event> listAllEvents() {
		return eventManager.listAllEvents();
	}
	
	@RequestMapping(value = "/login/list", method = RequestMethod.GET)
	List<User> listAllUsersLogin() {
		return userManager.listAllUsers();
	}
	
	@RequestMapping(value = "/users/list/size", method = RequestMethod.GET)
	int getUserSize() {
		return userManager.listAllUsers().size();
	}
	
	@RequestMapping(value = "/events/list/size", method = RequestMethod.GET)
	int getEventSize() {
		return eventManager.listAllEvents().size();
	}

	
	/*********** Web UI Test Utility **********/
	/**
	 * This method provide a simple web UI for you to test the different
	 * functionalities used in this web service.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	ModelAndView getHomepage() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("users", listAllUsers());
		return modelAndView;
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	ModelAndView getUserspage() {
		ModelAndView modelAndView = new ModelAndView("users");
		modelAndView.addObject("users", listAllUsers());
		return modelAndView;
	}
	
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	ModelAndView getEventspage() {
		ModelAndView modelAndViewEvents = new ModelAndView("events");
		modelAndViewEvents.addObject("events", listAllEvents());
		return modelAndViewEvents;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	ModelAndView getLoginpage() {
		ModelAndView modelAndViewLogin = new ModelAndView("login");
		modelAndViewLogin.addObject("users", listAllUsersLogin());
		return modelAndViewLogin;
	}
	
	@RequestMapping(value = "/users/{userID}/profile", method = RequestMethod.GET)
	ModelAndView getProfilepage() {
		ModelAndView modelAndViewProfile = new ModelAndView("profile");
		modelAndViewProfile.addObject("users", listAllUsers());
		return modelAndViewProfile;
	}	

}