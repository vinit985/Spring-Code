package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student=con.getBean("ob",Student.class);
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println(student.getCountry());
		System.out.println(student.getCountry().getClass().getName());
		Student student1=con.getBean("ob",Student.class);
		System.out.println(student1.hashCode());
		teacher t1=con.getBean("teacher",teacher.class);
		teacher t2=con.getBean("teacher",teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
