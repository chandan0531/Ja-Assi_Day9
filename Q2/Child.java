package com.assi.Q2;

public final class Child extends Parent{

	public Child(int number) {
		super(number);
	}
	
	@Override
	public void method1() {
		System.out.println("method1 from child");
		if(this.number<=10 && this.number>=1)
		{
			System.out.println("Final no. from Child : " + number);
		}
		else
		{
			System.out.println("Invalid number");
		}
		
	}

	public void method4() {
		System.out.println("method4 from child");
	}
}
