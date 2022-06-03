package com.assi.Q1;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;

	public Student() {
	
	}
	public Student(int roll, String name, int marks) {
//		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public void displayDetails(Student s) {
//		Student d1 = new Student(10, "sheela", 789);
//		 char a = d1.calculateGrade('n');
//		System.out.println(d1);
//		System.out.println(a);
		System.out.println(s.roll);
		System.out.println(s.name);
		System.out.println(s.marks);
		char grade = calculateGrade();
		this.grade = grade;
		System.out.println(s);
		
	}
	
	private char calculateGrade() {
		if(this.marks>= 500)
		{
			return 'A';
		}
		else if (this.marks< 500 && this.marks>=400)
		{
			return 'B';
		}
		else if(this.marks<400)
		{
			return 'C';
		}
		return 'n';
	}
	

	@Override
	public String toString() {
		
		return "Roll : " + roll + " Name : " + name+ " Marks : " + marks + " Grade : " + grade;
	}
	
	
}
