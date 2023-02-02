package kosa.book;

public class Manager {
	
	Book book1 = new Book("JAVA", 30000);
	Book book2 = new Book("JSP", 20000);
	Book book3 = new Book("Oracle", 15000);
	
	
	public void discountPrice() {
		
		
	}
	
	public void totalPrice() {
		int price = book1.getPrice() + book2.getPrice() + book3.getPrice();
		System.out.println("총금액:" + price);
	}
}
