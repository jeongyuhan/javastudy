package ex06_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMainClass {

	public static void main(String[] args) {
	
		// LinkedHashSet 클래스는 저장된 요소들의 순서가 유지된다.
		
		Set<String> set = new LinkedHashSet<String>();
		
		// 추가 (중복확인)
		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("html");
		set.add("css");
		set.add("javascript");
			
		// 향상 for문을 이용한 확인
		// HashSet과 다르게 LinkedHashSet은 저장된 순서대로 출력된다.
		for(String s : set) {
			System.out.println(s);
		}
		
		
		
	}

}
