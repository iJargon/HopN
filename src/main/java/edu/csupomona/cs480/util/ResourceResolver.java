package edu.csupomona.cs480.util;

import java.io.File;

/**
 * This is an utility class to help file locating.
 */
public class ResourceResolver {

	/** The base folder to store all the data used by this project. */
	private static final String BASE_DIR = System.getProperty("user.home") + "/cs480";

	/**
	 * Get the file used to store the user object JSON
	 *
	 * @param userId
	 * @return
	 */
	public static File getUserFile() {
		File file = new File(BASE_DIR + "/" + "user-map.json");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		return file;
	}
	
	/**
	 * Get the file used to store the event object JSON
	 *
	 * @param eventId
	 * @return
	 */
	public static File getEventFile() {
		File file = new File(BASE_DIR + "/" + "event-map.json");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		return file;
	}
}
