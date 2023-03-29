package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
	private List<String>name;
	private Map<String,Integer> feestructure;
	private Properties properties;
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}
	public person() {
		super();
	}
	public person(List<String> name, Map<String, Integer> feestructure) {
		super();
		this.name = name;
		this.feestructure = feestructure;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}
	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

}
