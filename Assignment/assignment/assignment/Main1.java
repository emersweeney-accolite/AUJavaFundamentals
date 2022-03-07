package assignment;

public class Main1 {
	public static void main(String[] args) {
		Account testAccount = new Account();
		
		testAccount.setAccountDetails(102030, 4000, "Savings Account");
		testAccount.withdraw(1500);
		testAccount.deposit(250);
		testAccount.dispAccountDetails();
	}
}
