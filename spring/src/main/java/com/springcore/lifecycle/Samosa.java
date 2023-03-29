package com.springcore.lifecycle;

public class Samosa{ 
	
	private double price;
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

    public Samosa() {
		super();
	}

    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price:property");
		this.price = price;
	}
	public void init()
	{
		System.out.println("Init method");
	}
	public void destroy()
	{
		System.out.println("Destroy");
	}




}
