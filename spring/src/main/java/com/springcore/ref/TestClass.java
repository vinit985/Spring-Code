package com.springcore.ref;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  context= new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A a =(A)context.getBean("aref");
		System.out.println(a.getA());
		System.out.println(a.getOb().getY());
		

	}

}
