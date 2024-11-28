package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Mobile {
	@Value("Samsung")
	String brand;
	
	@Autowired
	Sim s;
	public Mobile(String brand, Sim s) {
		super();
		this.brand = brand;
		this.s = s;
	}
	public Mobile() {
		super();
		System.out.println("Hi");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Sim getS() {
		return s;
	}
	public void setS(Sim s) {
		this.s = s;
	}
}
