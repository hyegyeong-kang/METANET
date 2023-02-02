package kosa.mission;

import java.util.Scanner;

public class Mission01_an {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5가지 정수 입력");
		
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		even += (num/10000%2 == 0) ? 1 : 0;
		even += (num/1000%10%2 == 0) ? 1 : 0;
		even += (num/100%10%2 == 0) ? 1 : 0;
		even += (num/10%10%2 == 0) ? 1 : 0;
		even += (num%2 == 0) ? 1 : 0;
		
		odd = 5 - even;
		
		System.out.println("짝수" + even + "개");
		System.out.println("홀수" + odd + "개");
	
	
	}

}
