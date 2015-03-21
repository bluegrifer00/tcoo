package it.proloco.dm;

import java.util.ArrayList;
import java.util.Date;

public class Event {
	Budget budget;
	Location location;
	Date startDate;
	Date endDate;
	
	String name;
	
	ArrayList<Stand> stands = new ArrayList<Stand>();

	public ArrayList<Stand> getStands() {
		return stands;
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	
	public void addStand(Stand s1) {
		stands.add(s1);
	}
}
