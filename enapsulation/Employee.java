package oops.enapsulation;

public class Employee {
	private int EmpId;
	private String EmpName;
	private double Salary;
	private String Post;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		this.EmpName = empName;
	}

	public double getSalary() {
		if (Salary < 10000) {
			System.out.println("Dusari job dhundo bhai");
		}
		return Salary;
		
	}

	public void setSalary(double salary) {

		this.Salary = salary;
		
	}

	public String getPost() {
		return Post;
	}

	public void setPost(String post) {
		this.Post = post;
	}

}
