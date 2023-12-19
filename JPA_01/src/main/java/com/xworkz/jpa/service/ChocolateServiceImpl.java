package com.xworkz.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.jpa.dto.ChocolateDTO;
import com.xworkz.jpa.repo.ChocolateRepo;

@Component
public class ChocolateServiceImpl implements ChocolateService {

	@Autowired
	private ChocolateRepo repo;

	@Override
	public boolean validateAndSave(ChocolateDTO dto, Model model) {
		if (dto != null) {
			if (dto.getName() != null && !dto.getName().isEmpty()) {
				if (dto.getPrice() > 0) {
					if (dto.getBrand() != null && !dto.getBrand().isEmpty()) {

						boolean exists = isExist(dto.getName(), model);
						if (!exists) {
							return repo.save(dto);
						} else {
							boolean updated = updatePriceByName(
									dto.getPrice() + findByName(dto.getName(), model).getPrice(), dto.getName(), model);
							model.addAttribute("exist", "Chocolate Updated");
							if (updated) {
								return true;
							}
							return false;
						}
					}
				}
			}
		}
		return false;

	}

	public boolean isExist(String name, Model model) {
		ChocolateDTO dto = findByName(name, model);
		if (dto != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ChocolateDTO findById(int id) {
		if (id > 0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public List<ChocolateDTO> readAll() {

		return repo.readAll();
	}

	@Override
	public ChocolateDTO findByName(String name, Model model) {
		if (name != null && !name.isEmpty()) {
			ChocolateDTO dto = repo.findByName(name, model);
			if (dto == null) {
				model.addAttribute("nameNotFound", "Chocolate does not matched");
				return dto;
			}
			return dto;
		}
		model.addAttribute("nameNotValid", "Chocolate is Not Valid");
		return null;
	}

	@Override
	public boolean updatePriceByName(int price, String name, Model model) {
		if (price > 0 & name != null && !name.isEmpty()) {
			return repo.updatePriceByName(price, name);
		}
		model.addAttribute("inputNotValid", "Either name or price is not valid");
		return false;
	}

	@Override
	public boolean deleteByID(int id, Model model) {
		if (id > 0) {
			return repo.deleteById(id, model);
		}
		return false;
	}
}
