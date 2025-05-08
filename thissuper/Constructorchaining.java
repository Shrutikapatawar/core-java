package thissuper;

public class Constructorchaining {
	public Constructorchaining() {
		System.out.println("this is the Constructor1");
	}
	
	public Constructorchaining(int a) {
		this();
		System.out.println("this is the Constructor2");
	}
	
	public Constructorchaining(int a ,int b) {
		this(3);
		System.out.println("this is the Constructor3");
	}
	
	public static void main(String[] args) {
		Constructorchaining N= new Constructorchaining(2, 3);
	}

}
