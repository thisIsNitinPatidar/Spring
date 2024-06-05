package com.springProject.constructor;

public class Certi 
{
	
	@Override
	public String toString() {
		
		return this.name;
	}

	public Certi(String name) {
		super();
		this.name = name;
	}

	public String name;
	

}
