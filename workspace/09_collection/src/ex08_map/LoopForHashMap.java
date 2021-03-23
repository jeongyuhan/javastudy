package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopForHashMap {

	public static void main(String[] args) {
		// Map은 데이터를 만들고 서버측에서 클라이언트측으로 정보를 넘길 때(자바를 이용할 경우 Map으로 만들어서) 많이 사용한다. 
		// 데이터를 모아서 넘겨주기 위해서 사용된다.
		
		
		Map<String, String> me = new HashMap<String, String>();
		me.put("name", "정유한");
		me.put("age", 27 + ""); // 나중에 변수를 처리할 경우 ""으로 묶어서 처리할 수 없기 때문에 나중에 ""를 더해서 String 타입으로 만들어 주는 것이 좋다.
		me.put("phone", "010-1111-2222");
		
		// 1. 향상 for문은 Key를 뺀다. (Key를 이용해서 Value를 빼낼 수 있기 때문이다.)
		// me에서 Key만 빼는 메소드 : keySet()
		Set<String> keys = me.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + me.get(key));
		}
				
		// 2. Iterator 인터페이스 순회
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			String value = me.get(key);
			System.out.println(key + " : " + value);
		}
		// 여기서 itr은 일회용이다. 다시한번더 순회 while문을 돌리면 itr을 찾을 수 없다고 나온다. 
		// 해결하려면 itr을 다시 만들어주고 while문을 돌려야한다.
		
		
		// 1번과 2번 순회 모두 keySet()을 사용하여 순회코드를 구성하였다.
		// 두가지 코드 모두 Set을 이용하여야 한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
