package kosa.data;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		OrderManager om = new OrderManager();

		while (true) {
			System.out.println("1.주문요청		2.주문처리		3. 매출액총액	4. 종료");
			Scanner sc = new Scanner(System.in);
			String chk = sc.nextLine();

			switch (chk) {
			case "1":
				om.makeOrder();
				break;
			case "2":
				om.printOrders();
				break;
			case "3":
				om.printTotalPrice();
				break;
			case "4":
				return;
			}
		}
	}

}