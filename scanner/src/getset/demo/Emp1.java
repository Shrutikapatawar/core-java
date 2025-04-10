package getset.demo;

public class Emp1 {
	public static void main(String[] args) {
		Employee E=new Employee();
		E.setEmpId(1);
		E.setEmpName("Shrutika");
		E.setPost("Tester");
		E.setSalary(20000);
		System.out.println("EMployeeId = "+E.getEmpId());
		System.out.println("Employee Name = "+E.getEmpName());
		System.out.println("Post = "+E.getPost());
		System.out.println("Salary = "+E.getSalary());
	}
}
