package com.priya;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Snapdragon implements Processor {

	public void process() {
		System.out.println("Snapdragon");
	}

}
