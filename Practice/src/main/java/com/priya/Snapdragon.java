package com.priya;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Snapdragon implements Processor{
		public Snapdragon()
		{
			System.out.println("Hi from snap");
		}
		public void process()
		{
			System.out.println("Snapdragon is processing");
		}
	
}
