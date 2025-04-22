package oops.abstraction.abclass;

public class Cow extends Aminal {

	@Override
	public void makeSound() {
		System.out.println("Hambhyaaaa");

	}

	public static void main(String[] args) {
		Cow W = new Cow();
		W.makeSound();
	}
}
