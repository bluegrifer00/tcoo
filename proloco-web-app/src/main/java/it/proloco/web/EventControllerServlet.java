package it.proloco.web;

import it.proloco.services.EventManagementService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventControllerServlet extends HttpServlet {

	private static final long serialVersionUID = -9062088940702497703L;

	private EventManagementService eventService = new EventManagementService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String startDateAsString = req.getParameter("startDate");
		String endDateAsString = req.getParameter("endDate");
		String minBudgetValueAsString = req.getParameter("minBudgetValue");
		String maxBudgetValueAsString = req.getParameter("maxBudgetValue");
		
		String locationName = req.getParameter("placeName");
		
		double minBudgetValue = Double.parseDouble(minBudgetValueAsString);
		double maxBudgetValue = Double.parseDouble(maxBudgetValueAsString);
		
		try {
			eventService.createEvent(name, minBudgetValue, maxBudgetValue, startDateAsString, endDateAsString, locationName);
			resp.getWriter().println("Evento registrato correttamente!");
		} catch (Exception e) {
			resp.getWriter().println("Attenzione! Si è verificato un errore nell'inserimento dell'evento!");
		}
	}
}