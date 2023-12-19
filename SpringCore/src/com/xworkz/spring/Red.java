package com.xworkz.spring;

import org.springframework.stereotype.Component;

@Component("r")
public class Red implements Color {

	@Override
	public void colorIs() {
		System.out.println("Color is red");
	}

}
