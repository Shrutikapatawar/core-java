package oops.abstraction.abclass;

public class Intrest extends BankAccount{

	@Override
	public void calculateInterest(int Principal ,int Rate,int Time) {
		int Interest=(Principal * Rate * Time) / 100;
		System.out.println("Interest is "+" "+Interest+" " +"on the time period " +Time+" "+"with the rate "+Rate);
	}
public static void main(String[] args) {
	Intrest I=new Intrest();
	I.withdraw(3000, 500);
	I.deposite(30000, 1230);
	I.calculateInterest(1000, 10, 10);
}
}
