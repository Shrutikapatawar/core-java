package oops.abstraction.ababsclass2;

public abstract class Shape implements Drawable{

public abstract  void draw();
public void DrawShape(String Shape) {
	switch (Shape) {
	case "Triangle":
		System.out.println("/_");
		break;
	case "Square":
		System.out.println("|_|");
		break;
	case "Rectangle ":
		System.out.println("|___|");
		break;
	case "circle":
		System.out.println("O");
		break;	
	default:
		System.out.println("Shape not found");
		break;
	}
}
}
