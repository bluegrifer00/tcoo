package it.proloco.dm;

import java.util.ArrayList;

public class Event {
	Budget budget;
	Location location;
	
	String name;
	
	ArrayList<Stand> stands = new ArrayList<Stand>();

	public ArrayList<Stand> getStands() {
		return stands;
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
