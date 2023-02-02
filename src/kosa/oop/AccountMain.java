package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account("11-111", "ff", 1000);
		Account account2 = new Account("11-111", "ff", 1000);
		
		account2.withdraw(3000);
		account2.printAccount();
	}

}
