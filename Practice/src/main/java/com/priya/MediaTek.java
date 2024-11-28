package com.priya;

import org.springframework.stereotype.Component;

@Component()
public class MediaTek implements Processor 
{
	public MediaTek() {System.out.println("Hi from mediatk");}
	public void process() {
		System.out.println("Mediatek is processing");
	}
}