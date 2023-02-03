package kosa.oop;

public class CheckingAccount extends Account{
	private String cardNo;
	
	public CheckingAccount() {}

	
	// CheckingAccount 객체를 만들었는데 어떻게 Account 거를 사용하냐 
	// 무조건 부모의 디폴트 (Account) 생성자를 호출하겠다는 것
	// 부모의 생성자가 있으니 
	
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); // 자식에서 부모 생성자를 호출 -> 자식의 데이터 값을 부모에게 전달하려고 하는 것 / 그때 super 를 쓰는것이다. 
		// 자식이 있으면 메모리에 부모도 올라가기때문에 부모 생성자도 호출해줘야 함 
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || getBalance() < amount) {
			throw new Exception("결재불능");
		}
		return withdraw(amount);
	}



	
	
}
