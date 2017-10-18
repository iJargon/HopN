package edu.csupomona.cs480.data.provider;

import java.util.List;

import edu.csupomona.cs480.data.Event;

public interface EventManager {

	/**
	 * Get the user information object based on
	 * the given eventID.
	 * <p>
	 *
	 * @param eventId
	 * @return the Event object
	 */
	public Event getEvent(int eventId);

	/**
	 * Update the given event object and persist it.
	 * <p>
	 * If the event does not exist before, this
	 * method will create a new record; otherwise,
	 * it will overwrite whatever is currently
	 * being stored.
	 *
	 * @param event object
	 */
	public void updateEvent(Event event);

	/**
	 * Delete the given event from the storage.
	 *
	 * @param eventID
	 */
	public void deleteEvent(int eventID);

	/**
	 * List all the current events in the storage.
	 *
	 * @return
	 */
	public List<Event> listAllEvents();
}
