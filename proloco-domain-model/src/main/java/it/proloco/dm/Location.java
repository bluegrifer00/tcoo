package it.proloco.dm;


public class Location extends GeoEntity {
	
	String name;
    String image;
    String description;
    String howToReachUs;
    
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHowToReachUs() {
		return howToReachUs;
	}

	public void setHowToReachUs(String howToReachUs) {
		this.howToReachUs = howToReachUs;
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}
}
