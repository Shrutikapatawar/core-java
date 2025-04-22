package oops.abstraction.abclass;

public class PartTimeEmployee extends Employee{

	@Override
	public void calculateSalary() {
		System.out.println("Parttime employee has salary 2LPA ");
		
	}
	
	public static void main(String[] args) {
		PartTimeEmployee P=new PartTimeEmployee();
		P.calculateSalary();
	}

}
