package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit{

	@Autowired
	@Qualifier("r")
	private Color color;
	
	@Override
	public void sweetness() {
		System.out.println("Apple is sweet");
		color.colorIs();
	}

}
