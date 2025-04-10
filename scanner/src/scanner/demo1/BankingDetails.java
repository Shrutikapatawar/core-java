package scanner.demo1;
//Create a bank account with account holder name and initial balance.
//Deposit and withdraw money.
//Show current balance.

import java.util.Scanner;
public class BankingDetails {
int Balance;
int InitailBalance;
	public int CreateAccount(String UserName,int Amount,String Pass) {
		
		System.out.println("UserName "+UserName);
		System.out.println("Amount "+Amount);
		System.out.println("your password is "+Pass);
		System.out.println("account initailized");
		Balance=Amount;
		return Balance;
	}
	
	public int DepositCash(int Amount) {
		System.out.println("Deposit amount: " + Amount);
        Balance =+ Amount;
        System.out.println("Total Balance = " + Balance);
        return Balance;
		
	}
	public void Withdraw() {
		
		
	}
	
	
}
