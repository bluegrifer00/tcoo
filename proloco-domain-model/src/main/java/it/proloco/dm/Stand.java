package it.proloco.dm;

public class Stand extends GeoEntity {
	String name;
	boolean informative;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInformative() {
		return informative;
	}

	public void setInformative(boolean informative) {
		this.informative = informative;
	}
}
