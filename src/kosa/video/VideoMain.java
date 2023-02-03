package kosa.video;

import java.util.Scanner;

public class VideoMain {

	public static void main(String[] args) {

		Video v1 = new Video("1","트랜스포머","서봉수");
		Video v2 = new Video("2","rrrr","444444");
		
		GeneralMember gm = new GeneralMember("kkk", "홀길동", "서울");
		
		gm.rental(v1);
		gm.showMemerInfo();
		
	}

}
