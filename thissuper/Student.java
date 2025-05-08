package thissuper;

public class Student {

	String Name;
	int Age;

	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
		System.out.println("Name ="+Name);
		System.out.println("Age ="+Age);
	}
	
	public static void main(String[] args) {
		Student S=new Student("shrutika", 20);
		
	}
}
