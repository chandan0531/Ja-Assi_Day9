package com.assi.Q2;

public class Parent {
	
	final int number;
	
	public Parent(int number) {
		this.number = number;
		
	}
	

	public void method1() {
		System.out.println("method1 from parent");
		System.out.println("Final no. from paraent : " + number);
	}
	
	public final void method2() {
		System.out.println("method2 from parent");
	}
	
	public void method3() {
		System.out.println("method3 from parent");
	}
	
}
