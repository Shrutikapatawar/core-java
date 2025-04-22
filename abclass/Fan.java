package oops.abstraction.abclass;

public class Fan extends Appliance {

	@Override
	public void powerConsumption() {
		System.out.println(
				"The The power consumed by a fan varies depending on the type and size. Generally, ceiling fans consume between 50-75 watts, while table fans typically consume 30-50 watts");
	}

	public static void main(String[] args) {
		Fan F = new Fan();
		F.powerConsumption();
	}
}
