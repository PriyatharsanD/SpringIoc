package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Redmi implements Mobile {
	@Value("10")
	int ram;
	int storage;
	@Autowired
	@Qualifier("snapdragon")
	Processor p;
	
	public Redmi()
	{
		System.out.println("hi from Redmi");
	}
	public void call() {
		System.out.println("Calling from Redmi");
	}
}