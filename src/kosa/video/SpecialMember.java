package kosa.video;

public class SpecialMember extends GeneralMember{
	private int bonus;

	public SpecialMember() {}
	
	public SpecialMember(String id, String name, String address, int bonus) {
		super(id, name, address);
		this.bonus = bonus;
	}
	
//	public void rentalVideo2(Video video) {
//		super.rental(video);
//		bonus += 10;
//	}
	
	
//	public void show2() {
//		super.showMemerInfo();
//		System.out.println("회원의 보너스 포인터 적립:" + bonus);
//	}

	// 왜 오버라이딩 했냐? 그렇게 해야 자바의 다형성을 구현할 수 있기 때문에
	// main 에서 메소드 호출할 때 메소드 이름 다 다르게 할 수 없으니까 하는 것
	@Override
	public void rental(Video video) {
		super.rental(video);
		bonus += 10;
	}
	
	@Override
	public void showMemerInfo() {
		super.showMemerInfo();
		System.out.println("회원의 보너스 포인터 적립:" + bonus);
	}
}
