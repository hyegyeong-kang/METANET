package kosa.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo arr[] = new PhoneInfo[10]; //안에 PHONEINFO 객체만 넣을 수 있음 
	Company com[] = new Company[10];
	Universe uni[] = new Universe[10];
	static Scanner sc = new Scanner(System.in);
	int count; // 멤버변수 필드는 초기화 할 필요없음. 초기화 값이 정해져있기 때문에 오류 안남 (0,null로 초기화)
	
	public void addPhoneinfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNum = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		
		System.out.println("1.일반 2.회사 3.동창");
		int chk = sc.nextInt();
		
		switch(chk) {
		case 1:
			arr[count++] = new PhoneInfo(name, phoneNum, birth);
			break;
		case 2:
			System.out.print("부서:");
			String dept = sc.nextLine();
			System.out.print("직위:");
			String position = sc.nextLine();
			
			arr[count++] = new Company(name, phoneNum, birth, dept, position);
			break;
		case 3:
			System.out.print("전공:");
			String major = sc.nextLine();
			System.out.print("학번:");
			String year = sc.nextLine();
			
			arr[count++] = new Universe(name, phoneNum, birth, major, year);
			break;
		}
	}
	
	public void listPhoneInfo() {
		System.out.println("1.일반 2.회사 3.동창");
		int chk = sc.nextInt();
		
		switch(chk) {
		case 1:
			for(int i = 0; i < count; i++) {
				arr[i].show();
			}
			break;
		case 2:
			for(int i = 0; i  < count; i++) {
				if(arr[i] instanceof Company) {
					arr[i].show();
				}
			}
			break;
		case 3:
			for(int i = 0; i  < count; i++) {
				if(arr[i] instanceof Universe) {
					arr[i].show();
				}
			}
			break;
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
