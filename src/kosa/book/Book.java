package kosa.book;

public class Book {
	// 상태: 책이름, 책가격, 할인된 가격
	// 기능: 할인된 가격 산출 , 전체적인 책 정보 출력 
	
	
	private String bookName;
	private int price;
	private int discountPrice;

	public Book() {}

	public Book(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}

	public void discount() {
		if(price >= 30000) {
			discountPrice = (int)(price * 0.75);
		}else if(price >= 20000) {
			discountPrice = (int)(price * 0.80);
		}else if(price >= 15000) {
			discountPrice = (int)(price * 0.85);
		}
	}
	
	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public void printBook() {
		System.out.println(bookName + "교재는 정가는" + price + "원, 할인된 가격은" + discountPrice +"원 입니다.");
	}
	
}
