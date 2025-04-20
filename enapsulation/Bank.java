package oops.enapsulation;

public class Bank {
public static void main(String[] args) {
	BankAccount B= new BankAccount();
	B.setAccountHolderName("Shrutika Patawar");
	B.setAccountNumber(980678393);
	B.setInitialBal(5000);
	System.out.println("Name = "+B.getAccountHolderName());
	System.out.println("AccountNumber = "+B.getAccountNumber());
	System.out.println("Initail Bal = "+B.getInitialBal());

	B.withdraw(400);
	
}
}
