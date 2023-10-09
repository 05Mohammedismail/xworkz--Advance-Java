package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;

public interface TempleService {

	boolean validateAndSave(TempleDTO dto);

	default int total() {
		return 0;
	}

	default Collection<TempleDTO> getAll() {
		return null;
	}

}
