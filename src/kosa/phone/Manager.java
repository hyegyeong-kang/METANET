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
	
	public void updatePhoneNum() {
		System.out.print("전화번호 수정 대상 이름:");
		String name = sc.nextLine();
		for(int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				System.out.println("수정할 전화번호를 입력하세요.");
				String phoneNo = sc.nextLine();
				arr[i].setPhoneNo(phoneNo);
				arr[i].show();
			}else {
				System.out.println("대상이 없습니다.");
			}
		}
	}
	
	public void deletePhoneNum() {
		System.out.println("전화번호 삭제 대상 이름:");
		String name = sc.nextLine();
		for(int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				//TODO
			}else {
				System.out.println("대상이 없습니다.");
			}
		}
		
	}
}
