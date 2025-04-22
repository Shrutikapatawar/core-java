package oops.abstraction.abclass;

public class Heater extends Appliance{

	@Override
	public void powerConsumption() {
		System.out.println("The power consumed by an electric heater  is 750 to 1500 Watt");
		
	}
	public static void main(String[] args) {
		Heater H= new Heater();
		H.powerConsumption();
	}

}
