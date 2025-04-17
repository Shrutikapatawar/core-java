package oops.polymorphism;

public class Triangle {
	public void Draw() {
		System.out.println("Draw the Triangle");
		System.out.println("/_");
	}
	public static void main(String[] args) {
		Rectangle R=new Rectangle();
		R.Draw();
		Triangle T=new Triangle();
		T.Draw();
		Circle A=new Circle();
		A.Draw();
		
	}
}
