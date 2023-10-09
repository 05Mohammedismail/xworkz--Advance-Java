package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repo.TempleRepo;

public class TempleServiceImpl implements TempleService {

	private TempleRepo repo;

	public TempleServiceImpl(TempleRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("Validate And Save in Temple Service" + dto);
		this.repo.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public Collection<TempleDTO> getAll() {
		return this.repo.getAll();
	}


}
