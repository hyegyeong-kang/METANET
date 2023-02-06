package kosa.order;

public class Order {
	// 주문번호, 회원내역, 제품내역, 수량, 주문금액
	private String orderNum;
	private Member member;
	private Item item;
	private int num;
	private int orderPrice;
	
	public Order() {}


	public Order(String orderNum, Member member, Item item, int num, int orderPrice) {
		super();
		this.orderNum = orderNum;
		this.member = member;
		this.item = item;
		this.num = num;
		this.orderPrice = orderPrice;
	}

	public void print() {
		System.out.println("주문번호: " + orderNum);
		System.out.println("회원이름: " + member.getName());
		System.out.println("회원주소: " + member.getAddress());
		System.out.println("주문한 상품 모델명: " + item.getModelName());
		System.out.println("주문한 상품 가격: " + item.getPrice());
		System.out.println("주문 수량: " + num);
		System.out.println("주문금액: " + orderPrice);
		
	}
	

}
