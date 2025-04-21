package oops.abstraction;

public class Cat implements Animal {

	@Override
	public void Sound() {
		System.out.println("Meow..Meowww..!!");

	}

	@Override
	public void Color() {
		System.out.println("Brown");
	}

	public static void main(String[] args) {
		Cat A = new Cat();
		A.Sound();
		A.Color();
	}
}
