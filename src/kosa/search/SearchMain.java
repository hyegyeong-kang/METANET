package kosa.search;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1-1 문자열 찾기
//		System.out.println("한 개의 문자열을 입력하세요.");
//		String inputString = sc.nextLine();
//		System.out.println("특정 문자를 입력하세요.");
//		char searchChar = sc.next().charAt(0);
//		
//		Search search = new Search(inputString, searchChar);
//		search.searchCharNum();
//		search.print();
		
		// 1-3 문장속 단어 찾기
		System.out.println("한 개의 문장을 입력하세요.");
		String inputString2 = sc.nextLine();
		Search search = new Search(inputString2);
		search.searchLongWord();
		
	}

}
