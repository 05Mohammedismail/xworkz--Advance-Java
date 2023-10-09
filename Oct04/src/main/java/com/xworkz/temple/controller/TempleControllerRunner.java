package com.xworkz.temple.controller;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.temple.dto.TempleDTO;

public class TempleControllerRunner {

	public static void main(String[] args) {

		TempleDTO dto1 = new TempleDTO("Shiva", "Bng", "Shiva", 2008);
		TempleDTO dto2 = new TempleDTO("Ram", "Mys", "Ram", 2000);
		TempleDTO dto3 = new TempleDTO("Krishna", "Dvg", "Krishna", 1995);
		TempleDTO dto4 = new TempleDTO("Hanuman", "Mng", "Hanuman", 2018);

		Collection<TempleDTO> items = new HashSet<TempleDTO>();
		items.add(dto1);
		items.add(dto2);
		items.add(dto3);
		items.add(dto4);

		System.out.println("Size of collection is " + items.size());

		System.out.println("Using for Each");

		try {
			for (TempleDTO ref : items) {
				System.out.println("Name : "+ref.getName());

				if (ref.getName().equalsIgnoreCase("krishna")) {
					items.remove(ref);
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}

		System.out.println("");

		System.out.println("Using iterator");

		Iterator<TempleDTO> iterator = items.iterator();

		while (iterator.hasNext()) {
			TempleDTO ele = iterator.next();
			if (ele.getPlace().equalsIgnoreCase("Mys")) {
				iterator.remove();
				System.out.println("Removed " + ele.getPlace());
			}
			System.out.println(ele.getPlace());

		}

		System.out.println("Size of collection is " + items.size());

	}

}
