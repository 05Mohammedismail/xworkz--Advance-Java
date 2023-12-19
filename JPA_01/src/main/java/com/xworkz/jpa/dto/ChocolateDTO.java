package com.xworkz.jpa.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chocolate")
@NamedQuery(name = "findByName", query = "Select dto from ChocolateDTO dto where dto.name = :nm")
@NamedQuery(name = "updatePrice", query = "Update ChocolateDTO dto Set dto.price = :pr Where dto.name = :nm")
@NamedQuery(name = "delete", query = "Delete from ChocolateDTO dto where dto.id = :i")
public class ChocolateDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int price;
	private String brand;
}
