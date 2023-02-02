package kosa.mission;

import java.util.Scanner;

public class For_Mission_01_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		
		int input = sc.nextInt();
		
		for(int i = input * input ; i > 0 + 1; i--) {
			System.out.print(i + " ");
			if(i % 5 == 0)
				System.out.println("");
		}
	}

}
