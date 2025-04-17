package oops.polymorphism;

public class ContractEmployee extends Employee{
	public void calculateSalary(int Sal) {
		System.out.println("Salary is "+Sal);
	}
	public static void main(String[] args) {
		ContractEmployee E=new ContractEmployee();
		E.calculateSalary(30000);
		E.calculateSalary(9587483);
	}
}
