package oops.abstraction;

//1. Create one Interface Bank , it contains abstract  method. 
//create one class SbiBank implements this to Bank interface. 
//and write logic for this method.

public class SBIBank implements Bank {
	@Override
	public void makePayment() {
System.out.println("Hello..!!");
	}
	public static void main(String[] args) {
		SBIBank S= new SBIBank();
		S.makePayment();
	}
}
