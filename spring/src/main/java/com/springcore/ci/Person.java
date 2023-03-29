package com.springcore.ci;
import java.util.List;
public class Person {
   private String name;
   private int personId;
   private Certi certi;
   private List<String> list;
public Person(String name, int personid,Certi certi,List<String> list) {
	super();
	this.name = name;
	this.personId = personid;
	this.certi = certi;
	this.list =list;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name+" :"+this.personId+"-----{"+this.certi.name+"}"+"Pincode----"+this.list;
}
   
}
