package com.springcore.ref;

public class A {
	private int A;
	private B ob;
	public A() {
		super();
	}

	@Override
	public String toString() {
		return "A [A=" + A + ", ob=" + ob + "]";
	}

	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}

}
