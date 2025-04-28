package oops.abstraction.ababsclass2;

import java.util.Scanner;

public class WashingMachine extends ElectronicDevice {

	@Override
	public void Operate() {
		System.out.println("WashingMachine Whirlpool Royal Fully-Automatic 7 kg limit");
		System.out.println("Samsung Eco Bubble Fully-Automatic 7 kg");
		System.out.println("LG Wind Jet Dry Semi-Automatic 7kg");
	}
	public static void main(String[] args) {
		System.out.println("Enter device name");
		System.out.println("Mobile");
		System.out.println("television");
		System.out.println("Laptop");
		System.out.println("Fridge");
		System.out.println("microwave ");
		System.out.println("WashingMachine");
		Scanner S = new Scanner(System.in);
		String Device=S.nextLine();
		WashingMachine M=new WashingMachine();
		M.EleDevice("WashingMachine");
		M.Operate();
	}

}
