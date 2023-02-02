package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수선언시 주의사항
		// 변수명은 특수문자 안됨, 숫자로 시작하면 안됨, 소문자로 시작, 합성어 -> 두번째 단어 첫자 대문자
		int num; // 변수선언(메모리할당)
		num = 10; // 변수초기화
		int num2 = 20;
		
		//기본리터럴
		// 정수값 -> int, 실수값 -> double, 'A' -> char , "문자열" -> String, true -> boolean
		double d = 3.14;
		float f = 3.14f;
		
		//byte<short<int<long<float<double
		//형변환 (Casting)
		//묵시적 형변환
		//작은 데이터형 -> 큰 데이터형 (ㅇ)
		//작은 데이터형 <- 큰 데이터형 (X) =>강제 형변환이  필요
		
		
		// 강제형변환 -> 데이터 손실 유발
		int b = (int)3.14; // print => 3 
		
		double num3 = 3.14 + 1;
		
		// int <==> char (아스키코드)
		char num4 = 'A';
		System.out.println((int)num4); // 65
		
		
		String str = new String("AAA");
		String str2 = "AAA"; // 특혜임
		
		// String <==> int
		String num5 = "1";
		int num6 = Integer.parseInt(num5);
		int result = num6 + 1;
		
		
		// int => String
		int num7 = 100;
		String num8 = String.valueOf(num7);
		String num9 = num7 + "";
		
		
		//퀴즈 
		String str4 = 7 + "7" + 7; // 777
		
		
		
		
	}

}
