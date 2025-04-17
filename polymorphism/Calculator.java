package oops.polymorphism;
//2.Create a Calculator class with overloaded add() methods:
//
//add()
//
//add(double, double)
//
//add(int, int, int)
public class Calculator {
public void Add(int X, int Y) {
	int Add=X+Y;
	System.out.println("Result = "+Add);
}

public void Add(Double X,Double Y) {

	Double Add=X+Y;
	System.out.println("Result = "+Add);
}

public void Add(int X,int Y,int Z) {

	int Add=X+Y+Z;
	System.out.println("Result = "+Add);
}
public static void main(String[] args) {
	System.out.println("Les's Call the all methods one by one..!!");
	Calculator A=new Calculator();
	A.Add(10, 20);
	A.Add(49.3, 283.9);
	A.Add(4, 20, 60);
}

}
