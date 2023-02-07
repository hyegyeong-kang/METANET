package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한쌍으로 Map 자료구조로 구현하자. ==> 김자바:80, 박자바: 50
		// 1. 시험 응시자만 출력
		// 2. 총점, 평균, 최고점수, 최저점수 : Collections => max(), min()
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 50);
		map.put("박자바", 100);
		map.put("강자바", 50);
		map.put("최자바", 50);
		
		// 1
		// map => key
		Set<String> key = map.keySet();
		System.out.println(key);
		
		
		// 2
		// map => value
		///////////////////교수님 코드
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		int total0 = 0;
		while(iter.hasNext()) {
			total0 += iter.next();
		}
		System.out.println("총점:" + total0);
		System.out.println("평균:" + total0/map.size());
		System.out.println("최고점수:" + Collections.max(values));
		System.out.println("최저점수:" + Collections.min(values));
		//////////////////
		
		
		
		Integer max = Collections.max(map.values());
		Integer min = Collections.min(map.values());
		int total = 0;
		for(Integer i : map.values()) {
			total += i;
		}
		Integer avg = total / map.values().size();
		
		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);
		System.out.println("최고점수:" + max);
		System.out.println("최저점수:" + min);
		
		
	}

}
