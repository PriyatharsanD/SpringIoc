package com.priya;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private int eno;
	private byte cc;
	public Engine(byte cc)
	{
		this.cc=cc;
	}
	
	public Engine() {
		super();
	}
	public Engine(int eno) {
		super();
		this.eno = eno;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public byte getCc() {
		return cc;
	}

	public void setCc(byte cc) {
		this.cc = cc;
	}

	
	

}
