package com.xworkz.jpa.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.jpa.dto.ChocolateDTO;

public interface ChocolateService {

	public boolean validateAndSave(ChocolateDTO dto, Model model);
	
	public boolean isExist(String name, Model model);
			
	public ChocolateDTO findById(int id);

	public List<ChocolateDTO> readAll();

	public ChocolateDTO findByName(String name, Model model);

	public boolean updatePriceByName(int price, String name, Model model);

	public boolean deleteByID(int id, Model model);
}
