package oops.polymorphism;

public class AreAcalculate {
public void Area(int rad) {
	Double area=3.14*rad*rad;
	System.out.println("Area of a circle "+area);
}
public void Area(int L,int B) {
	int area=L*B;
	System.out.println("Area of a rectangle "+area);
}

public void Area(Double side) {
	double area=side*side;
	System.out.println("Area of a square "+area);
}
public static void main(String[] args) {
	System.out.println("Here you go with all the methods..!!");
	AreAcalculate A=new AreAcalculate();
	A.Area(6);
	A.Area(40.7);
	A.Area(4, 4);
}
}
