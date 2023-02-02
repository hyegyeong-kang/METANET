package kosa.mission;
import java.util.*;

public class For_Mission_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		
		int input = sc.nextInt();
		
		for(int i = 1; i < input*input + 1; i++) {
			System.out.print(i + " ");
			if(i % 5 == 0)
				System.out.println("");
		}
		
		
	}

}
