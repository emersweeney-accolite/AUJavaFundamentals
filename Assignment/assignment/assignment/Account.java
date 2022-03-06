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
	
	//checks if withdrawal is legal, prints error message if not
	public void withdraw(int amount) {
		int newBalance = accountBalance - amount;
		if (newBalance<0) System.out.println("Error: not enough funds");
		else accountBalance = newBalance;
	}
	
	public void deposit(int amount) {
		accountBalance += amount;
	}
	
	//prints account details
	public void dispAccountDetails() {
		System.out.println("Account Number: " + accountNo
				+ "\nAccount Type: " + accountType
				+ "\nAccount Balance: " + accountBalance);
	}
}
