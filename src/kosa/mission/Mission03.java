package kosa.mission;

import java.util.Scanner;

public class Mission03 {
	
	static int cnt = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 배열에 문자열을 추가, 출력, 검색, 수정, 삭제
		
		String arr[] = new String[10];
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.print("메뉴입력");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				add(arr);
				break;
			case "2":
				print(arr);
				break;
			case "3":
				search(arr);
				break;
			case "4":
				update(arr);
				break;
			case "5":
				delete(arr);
				break;
			case "6":
				return;
			}
		}
		
	}
	
	public static void add(String arr[]) {
		System.out.println("이름을 입력하세요.");
		arr[cnt++] = sc.nextLine();
	}
	
	public static void print(String arr[]) {
		for(int i = 0; i < cnt; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void search(String arr[]) {
		System.out.println("검색할 문자열을 입력하세요.");
		String input = sc.nextLine();
		int idx = -1; // 없을 경우
		
		for(int i = 0; i < cnt; i++) {
			if(arr[i].equals(input)) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("해당 문자열은 존재하지 않습니다.");
		}else {
			System.out.println(idx + 1 + "번째 있습니다.");
		}
	}
	
	public static void update(String arr[]) {
		System.out.println("수정 이름:");
		String input = sc.nextLine();
		int index = sc.nextInt();
		int idx = -1;
		
		for(int i = 0; i < cnt; i++) {
			if(arr[i].equals(input)) {
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			System.out.println("해당 문자열은 존재하지 않습니다.");
		}else {
			System.out.println("수정할 이름:");
			arr[idx] = sc.nextLine();
		}
	}
	
	public static void delete(String arr[]) {
		System.out.println("삭제 이름:");
		String input = sc.nextLine();
		int index = sc.nextInt();
		int idx = -1;
		
		for(int i = 0; i < cnt; i++) {
			if(arr[i].equals(input)) {
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			System.out.println("해당 문자열은 존재하지 않습니다.");
		}else {
			for(int i = idx; i < cnt - 1; i++) {
				arr[i] = arr[i + 1];
			}
			cnt--;
		}
	}
}
