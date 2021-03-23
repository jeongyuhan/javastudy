package ex06_set;

import java.util.HashSet;
import java.util.Set;

/*
	HashSet 클래스
	1. Set 인터페이스를 구현한 클래스이다.
	2. 기본적인 특징
		1) 인덱스가 없다. (순서가 없다는 의미) 
		2) 중복 저장이 불가능하다.
	3. 기본적인 사용방법
		- List와 같지만, 인덱스가 없음에 주의!
*/

public class HashSetMainClass {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		// 추가 (중복된 데이터를 저장해보자.)
		set.add("java");
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add("spring");
		set.add("spring");
		
		// 길이 확인 (중복 저장이 되지 않기 때문에 중복은 제외되고 처리된다.)
		System.out.println("요소 갯수 : " + set.size());
		
		// 순회 (인덱스가 없기 때문에 향상 for문을 사용한다.)
		for(String s : set) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}
