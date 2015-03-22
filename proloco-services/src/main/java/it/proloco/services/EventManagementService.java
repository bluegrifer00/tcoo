package it.proloco.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import it.proloco.dm.Budget;
import it.proloco.dm.Event;
import it.proloco.dm.Location;
import it.proloco.services.dummy.InMemoryDatabase;


/**
 *  Here you can manage the Events (create, modify, delete, search)
 * 
 * @author Gianmarco
 */
public class EventManagementService {

	void createEvent(
			String name,
			// int id, 
			double minValue, 
			double maxValue,
			String startDateText,
			String endDateText,
			String locationName) throws Exception {
		
		Budget budget1 = new Budget();
		budget1.setMinValue(minValue);
		budget1.setMaxValue(maxValue);
		
		Location location1 = new Location();
		location1.setName(locationName);
		
		Event event1 = new Event();
		event1.setName(name);
		event1.setLocation(location1);
		event1.setBudget(budget1);
		// event.setId(id);
		
		SimpleDateFormat formatter = new SimpleDateFormat();
		formatter.applyPattern("dd/MM/yyyy");
		formatter.setLenient(false);
		
		Date startDate = formatter.parse(startDateText);
		Date endDate = formatter.parse(endDateText);
		
		if (startDate != null) {
			event1.setStartDate(startDate);
		}
			
		event1.setEndDate(endDate);
	}
	

	Event findEventById (int id){
		
		InMemoryDatabase db = new InMemoryDatabase();
		Event risultato = db.findById(id);
		return risultato;
			
	}
	
	ArrayList<Event> findEventsByStartDate (String inputDateText) throws ParseException {
		
		// ottengo la lista degli eventi e la salvo in un array
		InMemoryDatabase db = new InMemoryDatabase();
		ArrayList<Event> listOfEvents = db.findAllEvents();
		
		// trasformo la data in input, da String a Date
		SimpleDateFormat formatter = new SimpleDateFormat();
		formatter.applyPattern("dd/MM/yyyy");
		formatter.setLenient(false);
		Date InputDate = formatter.parse(inputDateText);
		
		ArrayList<Event> risultato = new ArrayList<Event>();
		// eseguo un ciclo è controllo se le date corrispondono
		for (Event selectedEvent: listOfEvents){
			Date EventDate = selectedEvent.getStartDate();
			
			
			if (EventDate == InputDate) {
				risultato.add(selectedEvent);
				
			}
			
					
		}
		
		return risultato;
		
	}

}
