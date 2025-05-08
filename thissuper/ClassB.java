package thissuper;

public class ClassB extends ClassA {
	@Override
	public void Display() {

		super.Display();
		System.out.println("Class B");
	}

	public static void main(String[] args) {
		ClassB B = new ClassB();
		B.Display();
	}
}
