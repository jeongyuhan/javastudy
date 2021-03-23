package ex08_map;

import java.util.HashMap;
import java.util.Map;

/*
	HashMap 클래스
	1. Map 인터페이스를 구현한 클래스이다.
	2. 데이터를 쌍(pair)으로 저장하는 클래스이다.
	3. 키(key) - 값(value)의 쌍으로 저장된다.
		1) 키(key) : 중복이 불가능하다. 
		2) 값(value) : 중복이 가능하다.
	4. 인덱스의 역할을 키(key)가 수행한다.	
*/

public class HashMapMainClass {

	public static void main(String[] args) {
		
		Map<String, Integer> sungjuk = new HashMap<String, Integer>();
		// 일반적으로 키(key)의 타입은 String으로 사용한다.
		
		// 1. 추가 : put(key, value)
		// 데이터를 저장하는 방법은 put() 메소드를 사용한다. 
		sungjuk.put("지구력", 80);
		sungjuk.put("근력", 70);
		sungjuk.put("인내력", 90);
		
		sungjuk.put("지구력", 100); // key는 중복이 불가능하다. 기존 지구력을 덮어쓴다.
		
		// 2. 삭제 : remove(key) 
		// key는 인덱스의 역할을 하기 때문에 중복되는값이없는 key값으로 분류해 삭제를 해준다.
		sungjuk.remove("근력");
		
		// 3. 요소 가져오기 : get(key)
		// key는 인덱스의 역할을 하기 때문에 중복되는값이없는 key값으로 요소를 구분해 가져와준다.
		System.out.println("지구력 : " + sungjuk.get("지구력"));
		System.out.println("인내력 : " + sungjuk.get("인내력"));
		
		// 4. 크기
		// 크기를 나타내는 메소드는 size() 메소드로 List와 Set과 같다.
		System.out.println("저장된 데이터 개수 : " + sungjuk.size());
		
		// 5. 출력
		System.out.println(sungjuk);
		
		
		// +)
		// 6. 순회는 방법이 많으므로 따로 진행한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
