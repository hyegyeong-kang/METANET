package kosa.phone;

public class Company extends PhoneInfo{
	// 부서, 포지션
	private String dept;
	private String position;
	
	public Company() {}
	
	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("부서:" + dept);
		System.out.println("직위:" + position);
	}
}
