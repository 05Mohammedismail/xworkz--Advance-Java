package com.xworkz.waste.repository;

import com.xworkz.waste.dto.WasteDTO;

public interface WasteRepository {
	
	int MAX_COUNT = 5;
	
	public void save(WasteDTO dto);

}
