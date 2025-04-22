package oops.abstraction.abclass;

public class Truck extends Vehicle{

	@Override
	public void move() {
		System.out.println("runs 80km/hr");
		
	}
	public static void main(String[] args) {
		Truck T= new Truck();
		T.move();
	}

}
