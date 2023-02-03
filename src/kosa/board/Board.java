package kosa.board;

import java.util.Scanner;

public class Board {
	// 글번호 , 제목, 작성자, 글내용
	private int num;
	private String title;
	private String name;
	private String content;
	private String reply;
	
	public Board() {};
	
	public Board(int num, String title, String name, String content) {
		super();
		this.num = num;
		this.title = title;
		this.name = name;
		this.content = content;
	}
	
	public void printList() {
		System.out.println("글번호:" + num);
		System.out.println("제목: " + title);
		System.out.println("작성자: " + name);
		System.out.println(" ");
	}
	
	public void printDetail() {
		System.out.println("글번호:" + num);
		System.out.println("제목: " + title);
		System.out.println("작성자: " + name);
		System.out.println("글 내용: " + content);
		System.out.println("댓글: " + reply);
		System.out.println(" ");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcontent() {
		return content;
	}

	public void setcontent(String content) {
		this.content = content;
	}
	
}
