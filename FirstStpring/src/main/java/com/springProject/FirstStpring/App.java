package com.springProject.FirstStpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Start program");
    	 System.out.println();
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringFirst.xml");
        Employee Emp1 =(Employee)context.getBean("Emp");
        System.out.println(Emp1);
        System.out.println();
        
        Employee Emp2 =(Employee)context.getBean("Emp5");
        System.out.println(Emp2);
        System.out.println();
        
        Student s = (Student) context.getBean("student");
        System.out.println(s);
        System.out.println();
        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);
        
        System.out.println();
        System.out.println("Done your Spring code");
    }
}
