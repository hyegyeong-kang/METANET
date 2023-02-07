package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		
		Food food1 = new Food("짜장면", 5000);
		Food food2 = new Food("짬뽕", 5500);
		Food food3 = new Food("탕수육", 10000);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("1.주문요청	2.주문처리	3. 매출액 총액	4. 종료");
			String chk = sc.nextLine();
			Order order = new Order(food1, 2);
			LinkedList<Order> q = new LinkedList<Order>();
			
			switch(chk) {
			case "1":
				q.offer(order);
			//	System.out.println("주문내역:" + order.getFood().getFoodName());
				System.out.println("주문내역:" + order.toString());
				break;
			case "2":
				q.poll();
				System.out.println("주문처리되었슴");
				break;
			case "3":
				order.showTotal();
				break;
			case "4":
				return;
			}
		}
		
		
	
		
	
	}

}
