package getset.demo;

public class BankAccount {
	private int accountNumber;
	private String AccountHolderName;
	private double InitialBal;
	private double TotalBal;
	private double UpdatedBal;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public double getInitialBal() {
		return InitialBal;
	}

	public void setInitialBal(double initialBal) {
		InitialBal = initialBal;
	}

	public double getTotalBal() {
		return TotalBal;
	}

	public void setTotalBal(double totalBal) {
		TotalBal = totalBal;
	}

	public double getUpdatedBal() {
		return UpdatedBal;
	}

	public void setUpdatedBal(double updatedBal) {
		UpdatedBal = updatedBal;
	}

	public void Deposite(Double amount) {
		if(amount<0) {
			System.out.println("Eorro 404");
		}else {

			Double TotalBal = InitialBal + amount;
			this.TotalBal = TotalBal;
			System.out.println("Bal after deposited amount " + TotalBal);
		}
	}

	public void withdraw(int WithdrawAmount) {
		if(WithdrawAmount<0) {
			System.out.println("Error 404");
		}
		else {
		UpdatedBal = TotalBal - WithdrawAmount;
		if(UpdatedBal<0) {
			UpdatedBal =  InitialBal- WithdrawAmount;
		}
		System.out.println("Bal after withdraw " + UpdatedBal);
	}}

}
