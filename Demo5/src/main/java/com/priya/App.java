package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		Car c = (Car) applicationContext.getBean(Car.class);
		System.out.println(c.e.getEno());
		System.out.println(c.e.getCc());
	}

}
