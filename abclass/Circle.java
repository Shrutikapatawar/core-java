package oops.abstraction.abclass;

public class Circle extends Shape {
	@Override
	public void calculateArea(int Length,int breath) {
		double area=3.14*Length*Length;
		System.out.println("Area = "+area);
	}

	public static void main(String[] args) {
		Circle N=new Circle();
		N.calculateArea(9,2);
	}
}
