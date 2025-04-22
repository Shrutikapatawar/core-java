package oops.abstraction.abclass;

public class Bike extends Vehicle{

	@Override
	public void move() {
		System.out.println("Runs 100km/hr");
		
	}
public static void main(String[] args) {
	Bike B=new Bike();
	B.move();
}
}
