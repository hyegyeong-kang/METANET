package kosa.mission;

import java.util.*;
public class Mission01 {

	public static void main(String[] args) {
		//임의의 정수값에 대해서 전체자리수 중 짝수, 홀수의 개수를 구하자.
		// 5자리수 
		// 출력 ==> 짝수의 개수 : 몇개 / 홀수의 개수 : 몇개 

		Scanner sc = new Scanner(System.in);
		System.out.print("5가지 정수 입력");
		
		String input = sc.nextLine();
		int arr[] = new int[input.length()];
		
		int oddCnt = 0;
		int evenCnt = 0;
		
		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);

		}
		for (int j = 0; j < input.length() ; j++) {
			if (arr[j] / 2 ==0) {
				evenCnt++;
			} else {
				oddCnt++;
			}
		}
		
		System.out.println("짝수" + evenCnt + "개");
		System.out.println("홀수" + oddCnt + "개");



	}

}
