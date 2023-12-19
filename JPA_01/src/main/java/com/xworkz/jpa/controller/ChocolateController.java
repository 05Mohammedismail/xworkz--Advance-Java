package com.xworkz.jpa.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.jpa.dto.ChocolateDTO;
import com.xworkz.jpa.service.ChocolateService;

@Controller
public class ChocolateController {

	@Autowired
	private ChocolateService service;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String save(ChocolateDTO dto, Model model) {
		boolean saved = service.validateAndSave(dto, model);
		if (saved) {
			model.addAttribute("save", "Saved Successfully");
			return "Chocolate";
		}
		model.addAttribute("save", "Not Saved");
		return "index";
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(@RequestParam int id, Model model) {
		ChocolateDTO dto = service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
			return "Chocolate";
		}
		model.addAttribute("findMessage", "Id Not Found");
		return "index";
	}

	@RequestMapping(value = "/sortId", method = RequestMethod.GET)
	public String readAllById(Model model) {
		List<ChocolateDTO> list = service.readAll();
		if (list != null) {
			model.addAttribute("list", list);
			return "Read";
		} else {
			model.addAttribute("readMessage", "Error in reading all");
			return "index";
		}
	}

	@RequestMapping(value = "/sortPrice", method = RequestMethod.GET)
	public String readAllByPrice(Model model) {
		List<ChocolateDTO> list = service.readAll();
		list = list.stream()
				.sorted((p1, p2) -> Integer.valueOf(p1.getPrice()).compareTo(Integer.valueOf(p2.getPrice())))
				.collect(Collectors.toList());
		if (list != null) {
			model.addAttribute("list", list);
			return "Read";
		} else {
			model.addAttribute("readMessage", "Error in reading all");
			return "index";
		}
	}

	@RequestMapping(value = "/findByName", method = RequestMethod.GET)
	public String findByName(@RequestParam String name, Model model) {
		ChocolateDTO dto = service.findByName(name, model);
		if (dto != null) {
			model.addAttribute("dto", dto);
			return "Found";
		} else {
			model.addAttribute("foundMessage", "Error finding Chocolate by name");
			return "index";
		}
	}

	@RequestMapping(value = "/updateName", method = RequestMethod.POST)
	public String updatePriceByName(@RequestParam int price, @RequestParam String name, Model model) {
		boolean updated = service.updatePriceByName(price, name, model);
		if (updated) {
			model.addAttribute("updateMessage", "Update Successfull !!!");
			return "index";
		} else {
			model.addAttribute("updateMessage", "Error in Updating price");
			return "index";
		}
	}

	@RequestMapping(value = "/deleteById", method = RequestMethod.POST)
	public String deleteByID(@RequestParam int id, Model model) {
		boolean deleted = service.deleteByID(id, model);
		if (deleted) {
			model.addAttribute("delete", "Chocolate Deleted");
			return "index";
		} else {
			model.addAttribute("delete", "Chocolate not found to delete");
			return "index";
		}
	}

}
