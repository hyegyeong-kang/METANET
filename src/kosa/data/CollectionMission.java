package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMission {

	public static void main(String[] args) {
		//로또번호 1-45 중복되지 않는 정수 6개를 출력
		Random r = new Random();
		// 1. 배열 
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					i = i - 1;
			}
		}
		
		Arrays.sort(arr);
		System.out.println("배열" + Arrays.toString(arr));
		
		
		
		// 2. List(ArrayList)
		List<Integer> list = new ArrayList<Integer>();
		while(true) {
			int n = r.nextInt(45) + 1;
			if (list.contains(n)) {
				continue;
			} else {
				list.add(n);
			}
			if (list.size() == 6) break;
		}
		Collections.sort(list);
		
//		for (int i = 0; i < arr.length; i++) {
//			list.add((int)(Math.random() * 45) + 1);
//		}
		System.out.println("리스트:" + list.toString());
		
		
		
		// 3. Set(TreeSet) // 중복 안되고 정렬 되어있음
		// 기본 정렬 조건 : Comparable -> compareTo() 오버라이딩
		// 정렬 기준 변경 : Comparator -> compare() 오버라이딩
		Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 내림차순 정렬 기준 정의
				if(o1  < o2) {
					return 1;
				} else if (o1 > o2){
					return -1;
				}
				return 0;
			}
		});
		
		Set<Integer> set2 
		= new TreeSet<Integer>((Integer o1, Integer o2) -> o2 - o1);
		
		
		
		for (int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45) + 1);
		}
		System.out.println("Set:" + set);
		
	}

}
