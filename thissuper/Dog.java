package thissuper;

public class Dog extends Animal{
	public  Dog() {
		super();
		System.out.println("Dog is created");
	}
	
	public static void main(String[] args) {
		Dog D=new Dog();
	}
}
