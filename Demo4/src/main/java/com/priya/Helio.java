package com.priya;

import org.springframework.stereotype.Component;

@Component
public class Helio implements Processor {

	public void process() {
		System.out.println("Helio is processing");
		
	}

}
