package com.priya;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Sim {
	String sp;
	@Value("8502")
	long num;
	public Sim() {
	}
	public Sim(String sp, long num) {
		super();
		System.out.println("Hello");
		this.sp = sp;
		this.num = num;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String toString()
	{
		return sp;
	}
	

}
