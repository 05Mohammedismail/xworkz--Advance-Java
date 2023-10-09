package com.xworkz.runner.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class StringRunner {

	static Collection<String> gmailOne = new ArrayList<String>();
	static Collection<String> gmailTwo = new ArrayList<String>();

	public static void main(String[] args) {
		System.out.println("add - to gmailOne");
		gmailOne.add("gmail-1");
		gmailOne.add("gmail-2");
		gmailOne.add("gmail-3");
		gmailOne.add("gmail-4");
		gmailOne.add("gmail-5");

		System.out.println(gmailOne + "\n");

		System.out.println("addAll - to gmailTwo from gmailOne");

		gmailTwo.addAll(gmailOne);
		System.out.println(gmailTwo + "\n");

		System.out.println("remove - from gmailTwo");
		gmailTwo.remove("gmail-3");
		System.out.println(gmailTwo + "\n");

		System.out.println("size - of gmailTwo");
		System.out.println(gmailTwo.size() + "\n");

		System.out.println("retainAll(modify) - gmailOne as gamilTwo");
		gmailOne.retainAll(gmailTwo);
		System.out.println(gmailOne + "\n");

		System.out.println("contains - in gmailOne");
		boolean check1 = gmailOne.contains("gmail-1");
		if (check1) {
			System.out.println("Yes it contains \n");
		} else {
			System.err.println("No it doesn't contains \n");
		}

		System.out.println("containsAll - gmailTwo contains All as gmailOne");
		boolean check2 = gmailTwo.containsAll(gmailOne);
		if (check2) {
			System.out.println("Yes it contains \n");
		} else {
			System.err.println("No it doesn't contains \n");
		}

		System.out.println("iterator - for gmailOne");
		Iterator<String> it = gmailOne.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
			System.out.println();
		
		System.out.println("removeAll - from gmailTwo");
		gmailTwo.removeAll(gmailTwo);
		System.out.println("Size after removeAll is " + gmailTwo.size() + "\n");
	
		System.out.println("isEmpty - for gmailTwo");
		boolean check3 = gmailTwo.isEmpty();
		if(check3) {
			System.out.println("Yes its empty \n");
		}
		else {
			System.out.println("No its not empty \n");
		}
		
		System.out.println("toArray - from gmailOne");
		Object[] arr = gmailOne.toArray();
		System.out.println("Array from gmailOne is " + Arrays.toString(arr));
	}
	

}
