package com.xworkz.waste.service;

import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.repository.WasteRepository;
import com.xworkz.waste.util.ValidateUtil;

public class WasteServiceImpl implements WasteService {

	private WasteRepository wasteRepository;

	public WasteServiceImpl(WasteRepository wasteRepository) {
		this.wasteRepository = wasteRepository;
	}

	@Override
	public boolean validate(WasteDTO dto) {
		if (dto != null) {
			System.out.println("Value is not null can save");
			String name = dto.getName();
			String type = dto.getType();
			double weight = dto.getWeight();

			if (ValidateUtil.validateString(name)) {
				System.out.println("Waste Name '" + name + "'is a valid input");
			} else {
				System.err.println("Waste Name '" + name + "'is a invalid input");
				return false;
			}

			if (ValidateUtil.validateString(type)) {
				System.out.println("Waste type '" + type + "'is a valid input");
			} else {
				System.err.println("Waste type'" + type + "'is a invalid input");
				return false;
			}

			if (ValidateUtil.validateNumber(weight)) {
				System.out.println("Waste weight '" + weight + "'is a valid input");
			} else {
				System.err.println("Waste weight '" + weight + "'is a invalid input");
				return false;
			}

			wasteRepository.save(dto);
			return true;
		}
		else {
			System.err.println("value is null cannot save");
		}
		return false;
	}

}
