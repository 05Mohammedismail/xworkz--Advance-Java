package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Fruit fruit = context.getBean(Apple.class);
		fruit.sweetness();
		Fruit fruit1 = context.getBean(Mango.class);
		fruit1.sweetness();
				
	}
}
