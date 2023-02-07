package kosa.data;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// List 에 Member 객체 3개를 추가
		// stream 을 이용하여 출력해보세요.
		List<Member> list = new ArrayList<>();

		list.add(new Member("kang1", 11));
		list.add(new Member("kang2", 22));
		list.add(new Member("kang3", 33));
		
		list.stream().forEach(member -> 
			System.out.println(member.getName()));

	}

}
