package com.priya;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(value="prototype")
public class Mediatek implements Processor {

	public void process() {
		System.out.println("Media Tek");
	}

}
