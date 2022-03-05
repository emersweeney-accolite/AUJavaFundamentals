package assignment;

public class Account {
	private int accountNo;
	private int accountBalance;
	private String accountType;
	
	public void setAccountDetails(int accountNo, int accountBalance, String accountType) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	
	public void withdraw(int amount) {
		int newBalance = accountBalance - amount;
		if (newBalance<0) System.out.println("Error: not enough funds");
		else accountBalance = newBalance;
	}
	
	public void deposit(int amount) {
		accountBalance += amount;
	}
	
	public void dispAccountDetails() {
		System.out.println("Account Number: " + accountNo
				+ "\n Account Type: " + accountType
				+ "\n Account Balance: " + accountBalance);
	}
}
