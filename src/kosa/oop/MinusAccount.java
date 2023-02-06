package kosa.oop;

public class MinusAccount extends Account{
	private int creditLine = 1000;
	
	public MinusAccount() {}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override
	public int withdraw(int amount) throws Exception{
		if (getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		}
		int balance = getBalance();
		setBalance(balance - amount);
		return amount;
	}
}
