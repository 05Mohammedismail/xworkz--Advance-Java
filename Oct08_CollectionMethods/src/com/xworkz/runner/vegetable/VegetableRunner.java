package com.xworkz.runner.vegetable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.vegetable.dto.VegetableDTO;

public class VegetableRunner {

	static Collection<VegetableDTO> collection1 = new HashSet<VegetableDTO>();
	static Collection<VegetableDTO> collection2 = new HashSet<VegetableDTO>();

	public static void main(String[] args) {

		VegetableDTO dto1 = new VegetableDTO(1, "Carrot", 45, 2);
		VegetableDTO dto2 = new VegetableDTO(2, "Beans", 40, 3);
		VegetableDTO dto3 = new VegetableDTO(3, "Cucumber", 10, 1);
		VegetableDTO dto4 = new VegetableDTO(4, "Tomato", 30, 2);
		VegetableDTO dto5 = new VegetableDTO(5, "Onion", 20, 1);
		VegetableDTO dto6 = new VegetableDTO(5, "Onion", 20, 1);

		System.out.println("add - to collection1");
		collection1.add(dto1);
		collection1.add(dto2);
		collection1.add(dto3);
		collection1.add(dto4);
		collection1.add(dto5);
		collection1.add(dto6);

		System.out.println(collection1 + "\n");

		System.out.println("addAll - to collection2 from collection1");

		collection2.addAll(collection1);
		System.out.println(collection2 + "\n");

		System.out.println("remove - from collection2");
		collection2.remove(dto2);
		System.out.println(collection2 + "\n");

		System.out.println("size - of collection2");
		System.out.println(collection2.size() + "\n");

		System.out.println("retainAll(modify) - collection1 as gamilTwo");
		collection1.retainAll(collection2);
		System.out.println(collection1 + "\n");

		System.out.println("contains - in collection1");
		boolean check1 = collection1.contains(dto3);
		if (check1) {
			System.out.println("Yes it contains \n");
		} else {
			System.err.println("No it doesn't contains \n");
		}

		System.out.println("containsAll - collection2 contains All as collection1");
		boolean check2 = collection2.containsAll(collection1);
		if (check2) {
			System.out.println("Yes it contains \n");
		} else {
			System.err.println("No it doesn't contains \n");
		}

		System.out.println("iterator - for collection1");
		Iterator<VegetableDTO> it = collection1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		System.out.println();

		System.out.println("removeAll - from collection2");
		collection2.removeAll(collection2);
		System.out.println("Size after removeAll is " + collection2.size() + "\n");

		System.out.println("isEmpty - for collection2");
		boolean check3 = collection2.isEmpty();
		if (check3) {
			System.out.println("Yes its empty \n");
		} else {
			System.out.println("No its not empty \n");
		}

		System.out.println("toArray - from collection1");
		Object[] arr = collection1.toArray();
		System.out.println("Array from collection1 is " + arr[0]);
	}

}
