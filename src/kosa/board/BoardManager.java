package kosa.board;

import java.util.Scanner;

public class BoardManager {
	Board arr[] = new Board[10];
	
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public void add() {
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("글을 입력하세요.");
		String content = sc.nextLine();
		
		arr[cnt++] = new Board(cnt, title, name, content);
	}
	
	public void printList() {
		for(int i = 0; i < cnt; i++) {
			arr[i].printList();
		}
	}
	
	public void printDetail() {
		for(int i = 0; i < cnt; i++) {
			arr[i].printDetail();
		}
	}
	
	public void reply() {
		System.out.println("댓글 작성할 글 번호를 입력해주세요.");
		String idx = sc.nextLine();
		for(int i = 0; i < cnt; i++) {
			if (arr[i].equals(idx)) {
				
			}else {
				System.out.println("글이 없음");
			}
		}
		
	}
}
