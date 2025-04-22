package oops.abstraction.abclass;

public class Student extends Person{

	@Override
	public void displayPerson(String Name,int age) {
		System.out.println("Name "+Name);
		System.out.println("Age = "+age);
	}
public static void main(String[] args) {
	Student N=new Student();
	N.displayPerson("Shrutika", 20);
}
}
