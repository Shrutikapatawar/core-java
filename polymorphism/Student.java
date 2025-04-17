package oops.polymorphism;

//4.Write a program to overload a constructor in a class:
//
//Constructor 1: takes no arguments
//
//Constructor 2: takes roll number
//
//Constructor 3: takes roll number and name
public class Student {
	public Student() {
		System.out.println("Let's Start..!!");
	}
	
	public Student(int RollNo) {
		System.out.println("Roll Number + "+RollNo);
	}
	
	public Student(int RollNo,String Name) {
		System.out.println("Name = "+Name);
		System.out.println("Roll Number = "+RollNo);
	}
	
	public static void main(String[] args) {
		Student S=new Student();
		Student S1=new Student(201);
		Student S2=new Student(202, "shruti");
	}
	
}
