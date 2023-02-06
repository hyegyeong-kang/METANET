package kosa.lamda;

public class LamdaExam {

	public static void main(String[] args) {
		// MyType -> 익명내부클래스로 구현하시오.
		
		MyType my1 = new MyType() {

			@Override
			public void hello() {
				System.out.println("익명클래스함수임");
			}
		};
		my1.hello();
		
		
		// 람다식으로 구현
		MyType my2 = () -> {
			System.out.println("람다식 함수입니다/");
		};
		my2.hello();
		
		
		// 향상된 람다식
		MyType my3 = () -> System.out.println("향상된 람다식");
		my3.hello();
		
		
		// 매개변수 있는 람다식
		YourType you = (String message) -> {
			System.out.println("메시지:" + message);
		};
		you.talk("hi");
		
		
		// 매개변수 있는 향상된 람다식
		YourType you2 = message -> System.out.println("메시지:" + message);
		you2.talk("hello");
		
		
		// MyNumber 의 getMax 구현해 두개의 값 중 큰 값이 출력되게 해라.
		MyNumber num = (int num1, int num2) -> {
			if (num1 < num2) {
				System.out.println("큰값:" + num2);
				return num2;
			} else {
				System.out.println("큰값:" + num1);
				return num1;
			}
		};
		num.getMax(1, 6);
		
		MyNumber my9 = (x, y) -> (x > y) ? x : y;
		my9.getMax(2, 5);
		
		
		
		//Runnable => 람다식 (1~10) 출력
		Runnable run = () -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(run);
		t.start();
		
		
	}

}
