package kosa.data;

import java.util.LinkedList;

public class Order {
	private Food food;
	private int amount;
	int total = 0;
	
	public Order() {}
	
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
		this.total = food.getPrice() * amount;
	}
	
	LinkedList<Order> q = new LinkedList<Order>();

	
	public void showTotal() {
		System.out.println("매출액:" + total);
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "[food=" + food + ", amount=" + amount + ", total=" + total + "]";
	}

	

}
