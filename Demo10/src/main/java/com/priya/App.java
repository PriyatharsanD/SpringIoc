package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		
		Student s1 = applicationContext.getBean(Student.class);
		Student s2 = applicationContext.getBean(Student.class);
		
		System.out.println(s1==s2);
		System.out.println(s1.getL()==s2.getL());
	}
}
