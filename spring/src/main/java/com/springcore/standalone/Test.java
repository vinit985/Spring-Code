package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/aloneconfig.xml");
		person p1 = context.getBean("person1",person.class);
		System.out.println(p1);
		System.out.println(p1.getName().getClass().getName());
		System.out.println(p1.getFeestructure().getClass().getName());
		System.out.println(p1.getProperties().getClass().getName());

	}

}
