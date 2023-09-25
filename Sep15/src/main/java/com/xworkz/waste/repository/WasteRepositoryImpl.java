package com.xworkz.waste.repository;

import com.xworkz.waste.dto.WasteDTO;

public class WasteRepositoryImpl implements WasteRepository {

	private WasteDTO[] dtos = new WasteDTO[MAX_COUNT];
	private int index = 0;

	@Override
	public void save(WasteDTO dto) {
		if (index < MAX_COUNT) {
			this.dtos[index] = dto;
			System.out.println(dto + " Stored at index : " + index);
			this.index++;
		} else {
			System.err.println("Index limit exceeded, cannot save more ");
		}

	}
}
