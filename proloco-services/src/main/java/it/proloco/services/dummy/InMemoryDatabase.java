package it.proloco.services.dummy;

import it.proloco.dm.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** 
 * A dummy (singleton) implementation of an in-memory database.
 * 
 * @author Andrea Gazzarini
 * @author Gianmarco Mechelli
 * @since 1.0
 */
public class InMemoryDatabase {
	
	private final static InMemoryDatabase INSTANCE = new InMemoryDatabase();
	
	private Map<Integer, Event> events = new HashMap<Integer, Event>();
	
	/**
	 * Private singleton constructor.
	 */
	private InMemoryDatabase() {
		// Nothing to be done here...
	}
	
	/**
	 * Returns the singleton instance of this {@link InMemoryDatabase}.
	 * 
	 * @return the singleton instance of this {@link InMemoryDatabase}.
	 */
	public static InMemoryDatabase getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Inserts a new event associated with the given identifier.
	 * 
	 * @param id the event identifier.
	 * @param event the event that will be inserted.
	 */
	public void insertNewEvent(int id, Event event) {
		events.put(id, event);
	}

	/**
	 * Updates the event associated with the given identifier.
	 * 
	 * @param id the event identifier.
	 * @param event the event that will be updated.
	 */
	public void updateEvent(int id, Event event) {
		events.put(id, event);
	}
	
	/**
	 * Remove the event associated with the given identifier.
	 * 
	 * @param id the event identifier.
	 */
	public void removeEvent(int id) {
		events.remove(id);
	}
	
	/**
	 * Returns the event associated with the given identifier.
	 * Returns null in case the event is not found.
	 * 
	 * @param id the event identifier.
	 * @return the event associated with the given identifier.
	 */
	public Event findById(int id) {
		return events.get(id);
	}
	
	/**
	 * Returns all events.
	 * Returns null if nothing found.
	 * 
	 * TODO: to implement 
	 */
	public ArrayList<Event> findAllEvents() {
		return null;
	}
}