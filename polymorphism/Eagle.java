package oops.polymorphism;

public class Eagle extends Bird{
	public void fly() {
		System.out.println("Eagle can fly");
	}
	
	public static void main(String[] args) {
		Eagle E=new Eagle();
		E.fly();
		Sprrow S=new Sprrow();
		S.fly();
	}
}
