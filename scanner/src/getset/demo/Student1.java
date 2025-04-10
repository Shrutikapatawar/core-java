package getset.demo;

public class Student1 {
	public static void main(String[] args) {
		Student S=new Student();
		S.setRollNo(201);
		S.setStudentName("Shrutika");
		S.setMarks(95);
		System.out.println("Student Details");
		System.out.println("EMployeeId = "+S.getRollNo());
		System.out.println("Student Name = "+S.getStudentName());
		System.out.println("Marks = "+S.getMarks());
}
}