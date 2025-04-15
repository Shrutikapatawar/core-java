package oops.practice;

public class MathsTeacher extends Teacher{
public void SolveEquation() {
	System.out.println("Solve Equation");
}
public static void main(String[] args) {
	MathsTeacher M=new MathsTeacher();
	M.Teach();
	M.SolveEquation();
}
}
