package it.proloco.services.dummy;

import it.proloco.dm.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** 
 * A dummy implementation of an in-memory database.
 * 
 * @author Andrea Gazzarini
 * @author Gianmarco Mechelli
 * @since 1.0
 */
public class InMemoryDatabase {
	private Map<Integer, Event> events = new HashMap<Integer, Event>();
	
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
	 * FIXME: occhio ai tag @ per indicare il tipo di ritrono. @author non ci va nei metodi, solo a livello di classe
	 * 
	 * FIXME: quando hai qualcosa da annotarti usa sempre TODO nei commenti, non // blabalbla in mezzo al codice.
	 * 
	 * @author Gianmarco
	 * Returns all events
	 * Returns null if nothing found
	 */
	public ArrayList<Event> findAllEvents() {
		return null; // to implement
		}
}