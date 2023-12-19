package com.xworkz.spring;

import org.springframework.stereotype.Component;

@Component("y")
public class Yellow implements Color {

	@Override
	public void colorIs() {
		System.out.println("Color is Yellow");
	}

}
