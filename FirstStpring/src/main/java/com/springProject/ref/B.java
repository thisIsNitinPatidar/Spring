package com.springProject.ref;

public class B 
{
	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

	private int y;

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public B(int y) 
	{
		super();
		this.y = y;
	}

	public B() 
	{
		super();
		
	}
	

}
