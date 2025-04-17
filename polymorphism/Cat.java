package oops.polymorphism;

public class Cat extends Animal {
	@Override
	public void Sound() {
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		Dog D=new Dog();
		D.Sound();
		Cat A=new Cat();
		A.Sound();
	}
}
