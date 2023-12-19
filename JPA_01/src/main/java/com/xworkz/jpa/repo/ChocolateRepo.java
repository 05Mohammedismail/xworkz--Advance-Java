package com.xworkz.jpa.repo;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.jpa.dto.ChocolateDTO;

public interface ChocolateRepo {

	public boolean save(ChocolateDTO dto);
	
	public ChocolateDTO findById(int id);

	public List<ChocolateDTO> readAll();

	public ChocolateDTO findByName(String name, Model model);

	public boolean updatePriceByName(int price, String name);

	public boolean deleteById(int id, Model model);
}
