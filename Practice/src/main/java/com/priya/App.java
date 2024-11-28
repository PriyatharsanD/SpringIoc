package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
	}
}