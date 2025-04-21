package oops.abstraction;
//2.Create an one Interface OnlinePayment , 
//it contains abstract makePayment() method. create two classes PhonePay and GooglePay implements this to Bank interface. 
//and write logic for this method. 
import java.util.Scanner;
public class PhonePay {
public void makePayment(int amount,int initialAmount){
	int Withdraw=initialAmount-amount;
	System.out.println("Remaining Amount "+Withdraw);
}

public  void ShowUPI() {
	System.out.println("9860415888@ybl");
}

public static void main(String[] args) {

	System.out.println("what do you want to do");
	System.out.println("1)Withdraw");
	System.out.println("2)Show UPI");
	Scanner option = new Scanner(System.in);
	int choice =option.nextInt();
	switch (choice) {
	case 1:
		PhonePay P=new PhonePay();
		P.makePayment(200, 2000);
		break;

	case 2:
		PhonePay P1=new PhonePay();
		P1.ShowUPI();
		break;
	}
	
}
}
