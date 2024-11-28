package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s = applicationContext.getBean(Samsung.class);
		s.aboutPhone();
		
		//Changing the processor
		s.p=applicationContext.getBean(Mediatek.class);
		s.aboutPhone();
	}
}