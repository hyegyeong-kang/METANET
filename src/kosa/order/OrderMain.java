package kosa.order;

public class OrderMain {

	public static void main(String[] args) {
		
		Member member = new Member("홍길동", "가산");
		Item item = new Item("갤럭시", "100원");
		
		Order o1 = new Order("1", member, item, 10, 1000);
		o1.print();
	}

}
