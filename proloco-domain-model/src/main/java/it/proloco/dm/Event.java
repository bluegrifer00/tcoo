package it.proloco.dm;

import java.util.ArrayList;
import java.util.Date;

public class Event /*extends DomainEntity (da togliere asterischi quando creata)*/{

	//proprietà della classe evento
	String name;
	Budget budget;
	Location location;
	Date startDate;
	Date endDate;
	ArrayList<Stand> stands = new ArrayList<Stand>();

	//creazione dei metodi Getter and Setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public Budget getBudget() {return budget;}
	public void setBudget(Budget budget) {this.budget = budget;}
	
	public Location getLocation() {return location;}
	public void setLocation(Location location) {this.location = location;}
	
	public Date getStartDate() {return startDate;}
	public void setStartDate(Date startDate) {this.startDate = startDate;}
 
	public Date getEndDate() {return endDate;}
	public void setEndDate(Date endDate) {this.endDate = endDate;}

	public ArrayList<Stand> getStands() {return stands;}
	public void addStand(Stand s1) {stands.add(s1);} //essendo un array, si usa add e non this

}