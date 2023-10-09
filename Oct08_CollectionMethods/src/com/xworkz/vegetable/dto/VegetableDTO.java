package com.xworkz.vegetable.dto;

import java.io.Serializable;

public class VegetableDTO implements Serializable {
	private int idNumber;
	private String name;
	private double Price;
	private double weight;

	public VegetableDTO() {
	}

	public VegetableDTO(int idNumber, String name, double price, double weight) {
		this.idNumber = idNumber;
		this.name = name;
		this.Price = price;
		this.weight = weight;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return Price;
	}

	public double getWeight() {
		return weight;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "idNumber=" + idNumber + ", name=" + name + ", Price=" + Price + ", weight=" + weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		VegetableDTO other = (VegetableDTO) obj;
		if (idNumber != other.idNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}
