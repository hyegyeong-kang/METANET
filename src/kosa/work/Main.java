package kosa.work;

public class Main {

	public static void main(String[] args) {
		Object obj[] = {
				new Reader("둘리"),
				new Work("길동"),
				new Student("마이콜"),
		};
		
		for(int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Speakable) {
				//obj[i].speak(); // object 로 형 변환했기 때문에 호출 안되는 것
				//Object 클래스에도 Speakable 이 있으면 가능함//
				Speakable speaker = (Speakable)obj[i];
				System.out.println(speaker.speak());
			}
		}
	}

}
