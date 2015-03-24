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
 * TODO: nome + cognome (o nickname)
 * @author Gianmarco
 */
public class EventManagementService {

	// TODO: metti i commenti
	public void createEvent(
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
	
	// TODO: nomi variabili in inglese
	// TODO: metti i commenti
	// TODO: deve essere public altrimenti nessuno lo può chiamare
	Event findEventById (int id){
		InMemoryDatabase db = new InMemoryDatabase();
		Event risultato = db.findById(id);
		return risultato;
	}
	
	// TODO: nomi variabili in inglese
	// TODO: metti i commenti
	// TODO: deve essere public altrimenti nessuno lo può chiamare
	// TODO: quando vuoi mettere delle linee vuote, al massimo lasciane una (e.g. riga 90 91) e sempre tra blocchi, 
	// non tra la fine di un blocco e la parentesi graffa (94) o tra due parentesi graffe (96 97).
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
		// eseguo un ciclo e controllo se le date corrispondono
		for (Event selectedEvent: listOfEvents){
			Date EventDate = selectedEvent.getStartDate();
			
			
			if (EventDate == InputDate) {
				risultato.add(selectedEvent);			
				
			}
			
					
		}
		
		return risultato;
		
	}

}
