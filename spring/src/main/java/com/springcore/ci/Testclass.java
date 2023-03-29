package com.springcore.ci;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context	=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	Person p =(Person)context.getBean("person1");
	System.out.println(p);
	Addition add1 = (Addition)context.getBean("add");
	add1.doSum();
	

	}

}
