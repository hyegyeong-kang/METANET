package kosa.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo arr[] = new PhoneInfo[10]; //안에 PHONEINFO 객체만 넣을 수 있음 
	static Scanner sc = new Scanner(System.in);
	int count; // 멤버변수 필드는 초기화 할 필요없음. 초기화 값이 정해져있기 때문에 오류 안남 (0,null로 초기화)
	
	public void addPhoneinfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNum = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		
		arr[count++] = new PhoneInfo(name, phoneNum, birth);
	}
	
	public void listPhoneInfo() {
		for(int i = 0; i < count; i++) {
			arr[i].show();
		}
	}
	
	public void searchPhoneNum() {
		System.out.print("검색할 이름:");
		String name = sc.nextLine();
		int idx = -1;
		for(int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.print("대상이 없습니다.");
		}
	}

}
