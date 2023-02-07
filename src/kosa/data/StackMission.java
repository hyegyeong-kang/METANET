package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로 수학수식을 입력
		// ((2+3)+10) => 괄호가 일치/ 불일치 판단 
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		
		System.out.println("수학수식을 입력해주세요.");
		String input = sc.nextLine();
		
		try {
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				
				if(ch == '(') {
					stack.push(ch + "");
				}else if(ch == ')') {
					stack.pop();
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 불일치합니다.");
			}
		} catch (Exception e) {
			System.out.println("괄호가 불일치합니다.");
		}
		
		
		
		
//		int open = 0;
//		int close = 0;
//		
//		String[] exp = input.split("");
//		for(int i = 0; i < exp.length; i++) {
//			if(exp[i].equals("(")) {
//				open++;
//			} else if (exp[i].equals(")")){
//				close++;
//			}
//		}
//		if (open != close) {
//			System.out.println("불일치");
//		} else {
//			System.out.println("일치");
//		}
	}

}
