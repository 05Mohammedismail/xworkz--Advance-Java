package com.xworkz.waste.dto;

import java.io.Serializable;

public class WasteDTO implements Serializable{
	
	private String name;
	private String type;
	private double weight;
	
	public WasteDTO() {
	}
	
	public WasteDTO(String name, String type, double weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name=" + name + ", type=" + type + ", weight=" + weight;
	}
	
	
	

}
