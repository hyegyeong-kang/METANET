package kosa.basic;

import java.util.*;

public class LoopExam {

	public static void main(String[] args) {
		// 퀴즈1 : 1~100 까지의 정수 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0 && i % 3 != 0) {
//				System.out.println(i);
//			}
//		}
//		
		// 퀴즈2: 2개의 정수를 입력받아 b-a 결과가 항상 양의 정수가 나오도록 구현해보자.
		int a = 0;
		int b = 0;
		
		do {
			System.out.println("2개의 정수를 입력해주세요.");
			
			Scanner sc = new Scanner(System.in);
			
			a = sc.nextInt();
			b = sc.nextInt();
		}while(b -a < 0);
		
		System.out.println(b - a);

	}

}
