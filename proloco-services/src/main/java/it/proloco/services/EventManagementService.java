package it.proloco.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import it.proloco.dm.Budget;
import it.proloco.dm.Event;
import it.proloco.dm.Location;

/**
 * @author xyz
 */
public class EventManagementService {

	void createEvent(
			String name, 
			double minValue, 
			double maxValue,
			String startDateText,
			String endDateText,
			String locationName) throws Exception {
		
		Budget budget = new Budget();
		budget.setMinValue(minValue);
		budget.setMaxValue(maxValue);
		
		Location location = new Location();
		location.setName(locationName);
		
		Event event = new Event();
		event.setBudget(budget);
		event.setName(name);
		event.setLocation(location);
		
		SimpleDateFormat formatter = new SimpleDateFormat();
		formatter.applyPattern("dd/MM/yyyy");
		formatter.setLenient(false);
		
		Date startDate = formatter.parse(startDateText);
		Date endDate = formatter.parse(endDateText);
		
		if (startDate != null) {
			event.setStartDate(startDate);
		}
			
		event.setEndDate(endDate);
	}
}
