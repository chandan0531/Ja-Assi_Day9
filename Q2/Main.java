package com.assi.Q2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		Parent p = new Child(num);
			
		p.method1();
		p.method2();
		p.method3();
		
		Child ch= (Child)p;
		ch.method4();
		ch.method1();
	
	}

}
