package kosa.bank;

public class Customer {
	private String id;
	private String name;
	private Account account;
	
	public Customer() {}
	
	public Customer(String id, String name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}
	
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.account = new Account(id, balance);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}
