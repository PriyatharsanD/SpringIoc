package com.priya;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements Processor{

	public void process() {
		System.out.println("Snapdragon is processing");
		
	}

}
