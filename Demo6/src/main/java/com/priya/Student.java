package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	Laptop l;

	public Laptop getL() {
		return l;
	}

	public void setL(Laptop l) {
		this.l = l;
	}
	
}