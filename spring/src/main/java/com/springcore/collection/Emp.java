package com.springcore.collection;
import java.util.*;
public class Emp {
	  
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", Address=" + Address + ", courses=" + courses + "]";
	}
	private String name;
	private List<String> phones;
	private Set<String> Address;
	private Map<String,String> courses;
	private Properties props;  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		Address = address;
		this.courses = courses;
	}
	public Emp() {
		super();
	}
	
	

}
