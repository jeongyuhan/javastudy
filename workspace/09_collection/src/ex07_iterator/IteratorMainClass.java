package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
	Iterator 인터페이스
	1. Collection(List, Set)을 순회하는 경우에 사용한다.
	2. "반복자"(Iterator) 라고 한다.
	3. 순회를 하고자 하는 Collection에 iterator() 메소드를 부착해서 생성한다.
	4. 인덱스의 유무와 상관없이 사용한다.
*/

public class IteratorMainClass {

	public static void main(String[] args) {

		
		// Iterator를 사용한 Set
		Set<String> set = new HashSet<String>();
		
		set.add("movie");
		set.add("music");
		set.add("sport");
		
		// set를 순회할 수 있는 Iterator 객체를 생성
		Iterator<String> itr1 = set.iterator(); // set를 순회할 수 있는 itr 객체 생성
		// Iterator는 인터페이스이기 때문에 new로 생성하는 것이 불가능하다.
		
		// hasNext() : 다음 요소가 있으면 true, 없으면 false를 반환
		// next()	 : 다음 요소를 가져온다.
		
		// 순회
		while(itr1.hasNext()) { // set에 남아 있는 요소가 있으면이라는 의미
			String str = itr1.next(); // 저장된 요소를 가져와서 str에 저장
			System.out.println(str); // 순서가 존재하지 않는다.
		}
		
		
		// Iterator를 사용한 List
		List<String> list = new ArrayList<String>();
		list.add("운동");
		list.add("음악듣기");
		list.add("영화보기");
		
		Iterator<String> itr2 = list.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
		
		
		
		
		
	}

}
