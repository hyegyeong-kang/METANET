package kosa.book;

public class Main {

	public static void main(String[] args) {
		int totalPrice = 0;
		
		Book arr[] = {
			new Book("Java", 30000),
			new Book("JSP", 20000),
			new Book("Oracle", 15000),
		};
		
		for(Book b : arr ) {
			b.discount();
			b.printBook();
			totalPrice += b.getDiscountPrice();
		}
		
		System.out.println("총합:" + totalPrice + "원");
	}
}
