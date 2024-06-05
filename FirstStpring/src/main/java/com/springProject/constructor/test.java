package com.springProject.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springProject.Collection.Student;

public class test 
{

	public static void main(String[] args) 
	{
		System.out.println("start program");
		 System.out.println();
		   ApplicationContext context= new ClassPathXmlApplicationContext("com/springProject/constructor/cIConfig.xml");
		 Person p = (Person)context.getBean("PCI");
		 System.out.println(p);

	}

}
