package oops.abstraction.ababsclass2;
import java.util.Scanner;
public abstract class ElectronicDevice {
	public abstract void Operate();
	public void EleDevice(String device_name) {
		if (device_name == "Mobile" || device_name == "mobile") {
			System.out.println("Mobile is available in stock");
		}else if (device_name == "television" || device_name == "Television") {
			System.out.println("Television is available in stock");
		}else if (device_name == "Laptop" || device_name == "laptop") {
			System.out.println("Laptop is available in stock");
		}else if (device_name == "Fridge" || device_name == "fridge") {
			System.out.println("Fridge is available in stock");
		}else if (device_name == "Microwave" || device_name == "microwave") {
			System.out.println("microwave is available in stock");
		}else if (device_name == "WashingMachine" || device_name == "WashingMachine") {
			System.out.println("WashingMachine is available in stock");
		}
	}
	
}
