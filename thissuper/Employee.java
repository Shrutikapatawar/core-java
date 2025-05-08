package thissuper;

//Create a class Employee with a method show(). 
//Create a subclass Manager that overrides show() and uses super.
//show() to call the parent version.

public class Employee {
	public void Show(String Name, double Sal, String Role) {
		System.out.println("Name " + Name);
		System.out.println("Salary " + Sal);
		System.out.println("Role " + Role);
	}

	
}

