package com.priya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s = (Samsung) context.getBean("samsung");
		s.aboutSamsung();
		
		Samsung s2 = context.getBean(Samsung.class);
		s2.aboutSamsung();
	}

}
