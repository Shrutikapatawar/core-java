package getset.demo;

public class Employee {
	private int EmpId;
	private String EmpName;
	private double Salary;
	private String Post;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int EmpId) {
		this.EmpId=EmpId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getPost() {
		return Post;
	}
	public void setPost(String post) {
		Post = post;
	}

	
}
