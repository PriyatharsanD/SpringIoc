package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	Processor p;
	public void aboutSamsung()
	{
		System.out.println("Samsung");
		p.process();
	}

}
