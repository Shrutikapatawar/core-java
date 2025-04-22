package oops.abstraction.abclass;

//Bank Account Interest
//Abstract class BankAccount 
//with methods deposit(), withdraw() and an abstract method calculateInterest().

public abstract class BankAccount {
public abstract void calculateInterest (int Principal ,int Rate,int Time) ;

public void deposite(int initialBal,int Amount) {
	int FinalBal=initialBal+Amount;
	System.out.println("available balance"+FinalBal);
}

public void withdraw(int initialBal,int Amount) {
	int FinalBal=initialBal-Amount;
	System.out.println("available balance"+FinalBal);
}
}
