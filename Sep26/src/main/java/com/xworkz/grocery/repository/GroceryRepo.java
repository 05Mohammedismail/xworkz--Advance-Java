package com.xworkz.grocery.repository;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;

public interface GroceryRepo {

	void save(GroceryDTO dto);

	default int total() {
		return 0;
	}

	default Collection<GroceryDTO> getAll() {
		return null;
	}
}
