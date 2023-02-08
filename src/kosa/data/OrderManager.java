package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;

public class OrderManager {
	Scanner sc = new Scanner(System.in);
	Order order = null;
	LinkedList<Order> q = new LinkedList<Order>();
	int total = 0;
	
	Food food1 = new Food("짜장면", 5000);
	Food food2 = new Food("짬뽕", 5500);
	Food food3 = new Food("탕수육", 10000);
	
	public OrderManager() {}
	
	public void makeOrder() {
		System.out.println("주문할 음식을 입력해주세요");
		String foodName = sc.nextLine();
		System.out.println("주문할 음식의 갯수를 입력해주세요");
		String strAmount = sc.nextLine();
		int amount = Integer.parseInt(strAmount);
		
		if (foodName.equals("짜장면")) {
			order = new Order(food1, amount);
		} else if (foodName.equals("짬뽕")) {
			order = new Order(food2, amount);
		} else if (foodName.equals("탕수육")) {
			order = new Order(food3, amount);
		}
		q.offer(order);
		System.out.println("주문 내역:" + q);
	}
	
	public void printOrders() {
		if (!q.isEmpty()) {
			System.out.println("주문 처리: " + q.poll());
		} else {
			System.out.println("주문내역이 없습니다.");
		}
	}
	
	public void printTotalPrice() {
		for (int i = 0; i < q.size(); i++) {
			total += q.get(i).getTotal();
		}
		System.out.println("총 매출액: " + total);
	}

}
