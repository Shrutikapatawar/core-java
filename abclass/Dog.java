package oops.abstraction.abclass;

public class Dog extends Aminal{

	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
	
	public static void main(String[] args) {
		Dog D=new Dog();
		D.makeSound();
	}

}
