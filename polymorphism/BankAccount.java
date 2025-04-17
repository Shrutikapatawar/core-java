package oops.polymorphism;

//5.Create a BankAccount class with overloaded deposit() methods:
//
//deposit(int amount)
//
//deposit(int amount, String mode) (like "cash", "cheque")

public class BankAccount {
public void Deposite(int Amount) {
	System.out.println("Amount = "+Amount);
}

public void Deposite(int Amount,String Mode) {
	System.out.println("Amount = "+Amount);
	System.out.println("Mode = "+Mode);
}

public static void main(String[] args) {
	BankAccount B=new BankAccount();
	B.Deposite(200);
	B.Deposite(900, "cheque");
}
}
