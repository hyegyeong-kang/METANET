package kosa.mission;

public class Mission02 {

	public static void main(String[] args) {
		// 여러명의 성적을 관리할 수 있는 프로그램을 구현해보자.
		// 키보드로부터 각 과목별로 점수를 선언해서 구현하자.
		// 번호	국어	영어	수학	총점	평균
		// 1	90	98	91	290	95
		// 2	21	45	43	180	45
		// =========================
		// 		280 260	330
		// 		50	60	70 
		
		int score01[][] = {{90, 98, 91}, {21, 45, 43}};
		int total[] = new int[score01.length];
		int avg[] = new int[score01.length];
		
		for(int i = 0; i < score01.length; i++) {
			for(int j = 0; j < score01[i].length; j++) {
				total[i] += score01[i][j];
			}
			avg[i] = total[i] / score01[i].length;
		}

		
		
		System.out.println("국어 영어 수학 총점 평균");
		for(int i = 0; i < score01.length; i++) {
			for(int j = 0; j < score01[i].length; j++)
				System.out.println(score01[i][j]);
		}

	

	}

}
