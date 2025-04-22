package oops.abstraction.abclass;

public class Rectangle extends Shape{

	@Override
	public void calculateArea(int Length,int Breath) {
		int area=Length*Breath;
		System.out.println("Area of the Rectangle = "+area);
	}
	
	public static void main(String[] args) {
		Rectangle R=new Rectangle();
		R.calculateArea(3, 2);
	}

}
