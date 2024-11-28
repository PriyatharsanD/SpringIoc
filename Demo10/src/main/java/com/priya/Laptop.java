package com.priya;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lap")
@Scope(value = "prototype")
public class Laptop {
	String brand;
	int ram;
	public Laptop(String brand, int ram) {
		super();
		this.brand = brand;
		this.ram = ram;
	}
	public Laptop() {
		super();
		System.out.println("Laptop is created");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
}
