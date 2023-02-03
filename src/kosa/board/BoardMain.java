package kosa.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardManager bm = new BoardManager();
		
		while(true) {
			System.out.println("1.글쓰기 2.글목록보기 3.글세부보기 4.댓글작성");
			int chk = sc.nextInt();
			switch(chk) {
			case 1:
				bm.add();
				break;
			case 2:
				bm.printList();
				break;
			case 3:
				bm.printDetail();
				break;
			case 4:
				break;
			}
		}
	}

}
