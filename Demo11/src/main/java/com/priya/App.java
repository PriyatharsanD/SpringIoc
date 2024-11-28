package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Mobile m1 = (Mobile) context.getBean(Mobile.class);
		Mobile m2 = (Mobile) context.getBean(Mobile.class);
		System.out.println(m1.getS().num);

	}
}
