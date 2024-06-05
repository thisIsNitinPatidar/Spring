package com.springProject.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
		 System.out.println("start program");
		 System.out.println();
		   ApplicationContext context= new ClassPathXmlApplicationContext("com/springProject/Collection/Config.xml");
		   Student s = (Student)context.getBean("stdn");
		   System.out.println();
		   System.out.println(s.getsId());
		   System.out.println(s.getsName());
		   System.out.println(s.getPhone());
		   System.out.println(s.getAddress());
		   System.out.println(s.getCourses());

	}

}
