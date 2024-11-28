package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
		Samsung s = context.getBean(Samsung.class);
		s.p.process();
	}
}