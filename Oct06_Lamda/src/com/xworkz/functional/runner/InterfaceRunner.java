package com.xworkz.functional.runner;

import com.xworkz.functional.Iphone;
import com.xworkz.functional.NewsPaper;
import com.xworkz.functional.Tyre;

public class InterfaceRunner {

	public static void main(String[] args) {

		Iphone iphone = () -> true;

		NewsPaper newsPaper = (agency) -> {
			if (agency.equalsIgnoreCase("Toi")) {
				return 8;
			} else if (agency.equalsIgnoreCase("Dc")) {
				return 5;
			} else if (agency.equalsIgnoreCase("Ht")) {
				return 4;
			} else {
				return -1;
			}
		};

		Tyre tyre = (brand, size, type) -> {
			if (brand.equalsIgnoreCase("mrf") && size == 17 && type.equalsIgnoreCase("two")) {
				return 1200;
			} else if (brand.equalsIgnoreCase("ceat") && size == 15 && type.equalsIgnoreCase("two")) {
				return 1000;
			}

			else if (brand.equalsIgnoreCase("tvs") && size == 12 && type.equalsIgnoreCase("two")) {
				return 900;
			} else {
				return -1;
			}
		};

		getIphone(iphone);
		getNewsPaper(newsPaper, "dc");
		getTyrePrice(tyre, "ceat", 15, "two");

	}

	static void getIphone(Iphone iphone) {
		boolean check = iphone.looksGood();
		System.out.println("Iphone check is " + check);
	}

	static void getNewsPaper(NewsPaper newsPaper, String agnecy) {
		double price = newsPaper.priceByAgency(agnecy);
		System.out.println("News Paper Price of " + agnecy + " is " + price);
	}

	static void getTyrePrice(Tyre tyre, String brand, int size, String type) {
		double price = tyre.getPrice(brand, size, type);
		System.out.println("Tyre price is " + price);
		
		
	}
}
