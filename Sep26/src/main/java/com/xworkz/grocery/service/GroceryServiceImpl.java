package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repository.GroceryRepo;

public class GroceryServiceImpl implements GroceryService {
	
	private GroceryRepo repo;
	
	public GroceryServiceImpl(GroceryRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(GroceryDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		this.repo.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public Collection<GroceryDTO> getAll() {
		return this.repo.getAll();
		
	}
}
