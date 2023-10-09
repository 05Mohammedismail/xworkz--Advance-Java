package com.xworkz.temple.repo;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;

public interface TempleRepo {

	void save(TempleDTO dto);

	default int total() {
		return 0;
	}

	default Collection<TempleDTO> getAll() {
		return null;
	}
}
