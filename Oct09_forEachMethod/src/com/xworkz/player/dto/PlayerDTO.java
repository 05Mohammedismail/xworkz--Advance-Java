package com.xworkz.player.dto;

import java.io.Serializable;

import com.xworkz.player.Enum.SportType;

public class PlayerDTO implements Serializable {

	private int idNum;
	private String name;
	private int age;
	private String countryName;
	private SportType sport;
	
	
	public PlayerDTO() {
	}


	public PlayerDTO(int idNum, String name, int age, String countryName, SportType sport) {
		this.idNum = idNum;
		this.name = name;
		this.age = age;
		this.countryName = countryName;
		this.sport = sport;
	}


	public int getIdNum() {
		return idNum;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getCountryName() {
		return countryName;
	}


	public SportType getSport() {
		return sport;
	}


	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public void setSport(SportType sport) {
		this.sport = sport;
	}


	@Override
	public String toString() {
		return "idNum=" + idNum + ", name=" + name + ", age=" + age + ", countryName=" + countryName + ", sport="
				+ sport + "\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNum;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sport == null) ? 0 : sport.hashCode());
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
		PlayerDTO other = (PlayerDTO) obj;
		if (idNum != other.idNum)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sport != other.sport)
			return false;
		return true;
	}
	
	
}
