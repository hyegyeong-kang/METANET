package kosa.oop;

public class Account {
	// 계좌 객체
	// 상태(필드) : 계좌번호, 계좌주, 잔액 -> 멤버변수
	// 기능(메서드) : 입금하다, 출금하다.
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
	// 생성자 - 객체 생성하기 위한 가이드임
	public Account() {} // 디폴트 생성자 무조건 만들어 줘야 함. 언제 자기 자신이 부모클래스가 될 수 있기때문에 
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(balance < amount) {
			return 0;
		}
		balance -= amount;
		
		return balance;
	}
	
	public void printAccount() {
		System.out.println("계좌번호:" + accountNo);
		System.out.println("계좌번호:" + accountNo);
		System.out.println("계좌번호:" + accountNo);
	}
}
