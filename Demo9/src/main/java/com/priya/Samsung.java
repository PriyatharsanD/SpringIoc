package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	@Qualifier("snapdragon")
	Processor p;
	public void aboutPhone()
	{
		System.out.println("Samsung");
		p.process();
	}
}
