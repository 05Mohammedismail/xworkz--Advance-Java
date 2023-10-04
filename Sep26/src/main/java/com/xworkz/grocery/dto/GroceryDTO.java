package com.xworkz.grocery.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class GroceryDTO implements Serializable {

	private String name;
	private String type;
	private double price;
	private double quantity;

	public GroceryDTO() {
	}

	public GroceryDTO(String name, String type, double price, double quantity) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "name=" + name + ", type=" + type + ", price=" + price + ", quantity=" + quantity;
	}

}
