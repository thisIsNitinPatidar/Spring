package com.springProject.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		 System.out.println("start program");
		 System.out.println();
		   ApplicationContext context= new ClassPathXmlApplicationContext("com/springProject/ref/refConfig.xml");
		   A a=(A) context.getBean("aref");
		   
		   B b=(B) context.getBean("bref");
		   
		   System.out.println(a.getOb().getY());
		   System.out.println(a.getX());
		   System.out.println(a);

	}

}
