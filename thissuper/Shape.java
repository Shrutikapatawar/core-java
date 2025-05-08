package thissuper;

//Create a superclass Shape with a method calculateArea(). 
//Create a subclass Circle that overrides it. 
//Use super to call the Shape version of calculateArea() from Circle.

public class Shape {
	final double pi = 3.14;

	public void calculateArea(int r) {
		double Area = (this.pi) * r * r;
		System.out.println("Area = " + Area);
	}
}
