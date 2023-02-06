package kosa.phone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1.전화번호 추가  2.전화번호 목록 출력  3.검색 4. 종료
		Scanner sc = new Scanner(System.in);
		Manager mg = new Manager();
		while(true) {
			System.out.println("1: 전화번호 추가 / 2: 전화번호 목록 출력 / 3: 전화번호 검색 / 4: 전화번호 수정 / 5: 전화번호 삭제 / 6.종료");
			int chk = sc.nextInt();
			switch(chk) {
			case 1:
				mg.addPhoneinfo();
				break;
			case 2:
				mg.listPhoneInfo();
				break;
			case 3:
				mg.searchPhoneNum();
				break;
			case 4:
				mg.updatePhoneNum();
				break;
			case 5:
				mg.deletePhoneNum();
				break;
			case 6:
				return;
			}
		}
	}
}
