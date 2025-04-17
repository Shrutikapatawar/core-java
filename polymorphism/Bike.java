package oops.polymorphism;

public class Bike extends Vehicle{
	public void move() {
		System.out.println("Bike is moving");
	}
	
	public static void main(String[] args) {
		Bike B=new Bike();
		B.move();
		Car A=new Car();
		A.move();
	}
}
