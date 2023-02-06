package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExam {

	public static void main(String[] args) {
		int arr[] = {3, 2, 1};
		int brr[] = arr; // arr 의 주소값이 전달되는 것임
		
//		brr[0] = 10;
//		System.out.println("brr:" + brr[0]);
//		System.out.println("arr:" + arr[0]);
		
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); // 오름차순
		
		//내림차순
//		for(int i = arr.length - 1; i >= 0; i--)
//			System.out.println(arr[i]);
		
		int arr2[][] = {{2, 90}, {1, 60}, {3, 20}};
		
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬기준 작성: 1차원 배열 안에 첫번째 요소를 기준으로 오름차순
				if(o1[0] < o2[0]) {
					return -1; // 자리이동 x
				}else if(o1[0] > o2[0]) {
					return 1; // 자리이동 o
				}else {
					return 0; 
				}	
			}
		});
		System.out.println(Arrays.deepToString(arr2));
	}
}
