package scanner.demo1;

import java.util.Scanner;

public class CallBanking {
	public static void main(String[] args) {
		
		
			System.out.println("Creating account");

			System.out.println("Enter user name");
			Scanner Sc = new Scanner(System.in);
			String UserName = Sc.nextLine();
			Sc.nextLine();
			System.out.println("enter the initial amount you want to deposite");
			int Amount = Sc.nextInt();
			Sc.nextLine();
			System.out.println("enter the password");
			String Pass = Sc.nextLine();
			Sc.nextLine();
			BankingDetails N = new BankingDetails();
			N.CreateAccount(UserName, Amount, Pass);
		
			System.out.println("1)Deposit");
			System.out.println("2)Withdraw");
			System.out.println("3)Show Balance");
			System.out.println("Enter your Choice");
			int Choice = Sc.nextInt();
			if (Choice == 1) {
				System.out.println("DepositCash");

				System.out.println("enter the amount you have to deposit...");
				int AmountDeposit = Sc.nextInt();
				BankingDetails N1 = new BankingDetails();
				N.DepositCash(Amount);
			} else if (Choice == 2) {
				System.out.println("WithdrawCash");
				BankingDetails N1 = new BankingDetails();
				N.Withdraw();

			} else if (Choice == 3) {
				System.out.println("Show Balance");
				BankingDetails N1 = new BankingDetails();
			
			}
		

	}

}
