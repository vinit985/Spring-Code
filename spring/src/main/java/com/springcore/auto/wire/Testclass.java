package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
      Emp e1=context.getBean("emp1",Emp.class);
      System.out.println(e1);

	}

}
