package com.xworkz.spring;

import org.springframework.stereotype.Component;

@Component
public class Mango implements Fruit{

	@Override
	public void sweetness() {
		System.out.println("Mango is sweet");
	}

}
