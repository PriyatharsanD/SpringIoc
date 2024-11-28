package com.priya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {
	String name;
	int id;
	@Autowired
	@Qualifier("lap")
	private Laptop l;
	public Student() {
		super();
		System.out.println("Student is Created");
	}
	public Student(String name, int id, Laptop l) {
		super();
		this.name = name;
		this.id = id;
		this.l = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Laptop getL()
	{
		return l;
	}
	
	
}
