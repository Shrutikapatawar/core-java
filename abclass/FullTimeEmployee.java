package oops.abstraction.abclass;

public class FullTimeEmployee extends Employee{

	@Override
	public void calculateSalary() {
		System.out.println("Fulltime Employee has salary = 6LPA");
		
	}
	
	public static void main(String[] args) {
		FullTimeEmployee F=new  FullTimeEmployee();
		F.calculateSalary();
	}

}
