package kosa.video;

public class VideoMain {

	public static void main(String[] args) {

		Video v1 = new Video("1","트랜스포머","서봉수");
		Video v2 = new Video("2","rrrr","444444");

		// 자식들은 부모의 데이터로 모을 수 있음
		GeneralMember arr[] = {
				new GeneralMember("kkk", "홀길동", "서울"),
				new SpecialMember("kang", "kang", "gkgk", 0)
		};
		//형변환했기 때문에 자기 자신만 가지고 있는 메소드 호출하지 못함
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].rental(v1);
			arr[i].showMemerInfo();
			// 각자의 오버라이딩 한 메소드가 호출될 것임 (우리가 보기에는 같아보이겠지)-> 자바의 다형성
		}
		
//		GeneralMember gm = new GeneralMember("kkk", "홀길동", "서울");
//		GeneralMember gm2 = new GeneralMember("vvv", "ssss", "서울");
//		SpecialMember sm = new SpecialMember("kang", "kang", "gkgk", 0);
//		
//		sm.rentalVideo2(v1);
//		sm.show2();
//		
//		gm.rental(v1);
//		gm.showMemerInfo();
	}

}
