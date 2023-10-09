package com.xworkz.temple.dto;

import java.io.Serializable;

public class TempleDTO implements Serializable {

	private String name;
	private String place;
	private String godName;
	private int constructedIn;
	
	public TempleDTO() {
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TempleDTO other = (TempleDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}


	public TempleDTO(String name, String place, String godName, int constructedIn) {
		this.name = name;
		this.place = place;
		this.godName = godName;
		this.constructedIn = constructedIn;
	}

	public String getName() {
		return name;
	}

	public String getPlace() {
		return place;
	}

	public String getGodName() {
		return godName;
	}

	public int getConstructedIn() {
		return constructedIn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	public void setConstructedIn(int constructedIn) {
		this.constructedIn = constructedIn;
	}

	@Override
	public String toString() {
		return "name=" + name + ", place=" + place + ", godName=" + godName + ", constructedIn=" + constructedIn;
	}
	
	

	
}
