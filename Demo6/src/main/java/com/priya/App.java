package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Laptop l = (Laptop)context.getBean(Laptop.class);
		Student s = (Student) context.getBean(Student.class);
		System.out.println(s.l);
		
		String str = (String)context.getBean(String.class);
		System.out.println(str);
	} 

}
