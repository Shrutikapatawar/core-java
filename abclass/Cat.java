package oops.abstraction.abclass;

public class Cat extends Aminal {

	@Override
	public void makeSound() {
		System.out.println("Meowwww");

	}

	public static void main(String[] args) {
		Cat A = new Cat();
		A.makeSound();
	}
}
