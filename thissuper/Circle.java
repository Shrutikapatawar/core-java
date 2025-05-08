package thissuper;

public class Circle extends Shape {
	@Override
	public void calculateArea(int r) {
		System.out.println("Area of the Shape");
		super.calculateArea(r);

	}

	public static void main(String[] args) {
		Circle A = new Circle();
		A.calculateArea(4);
	}
}
