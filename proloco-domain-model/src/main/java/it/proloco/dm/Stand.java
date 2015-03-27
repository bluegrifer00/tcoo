package it.proloco.dm;

public class Stand extends GeoEntity {
	String name;
	String logo;
	
	boolean informative;
	
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

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
