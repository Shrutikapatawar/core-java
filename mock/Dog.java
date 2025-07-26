package mock;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Barkk..!!");
		
	}
	public static void main(String[] args) {
		Animal d=new Dog();
		d.sound();
	}
	
}
