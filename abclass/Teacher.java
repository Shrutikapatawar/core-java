package oops.abstraction.abclass;

public class Teacher extends Person{

	@Override
	public void displayPerson(String Name, int age) {
		System.out.println("Name = "+Name);
		System.out.println("Age = "+age);
	}
public static void main(String[] args) {
	Teacher T= new Teacher();
	T.displayPerson("Shubham", 40);
}
}
