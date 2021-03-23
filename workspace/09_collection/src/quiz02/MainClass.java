package quiz02;

import java.util.ArrayList;
import java.util.List;

// 문제.
// 1 ~ 10000 사이의 값을 가지고 있는 ArrayList를 2개 만들고,
// 모든 요소를 하나씩 삭제한다.
// 1. 가장 성능이 나쁜 방법
// 2. 가장 성능이 좋은 방법

public class MainClass {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10000; i++) {
			list1.add(i + 1);
			list2.add(i + 1);
		}
				
		// 1. 나쁜 성능의 방법
		// 인덱스 0번에 있는 데이터만 계속해서 지워주고 지워진 자리를 뒤에있는 데이터들이 자리를 채우는 형식
		long start1 = System.nanoTime();
		for(int i = 0, length = list1.size(); i < length; i++) {
			list1.remove(0);
		}
		long end1 = System.nanoTime();
		
		// 2. 좋은 성능의 방법
		// 뒤에서부터 앞으로 순차적으로 지워나가는 형식
		long start2 = System.nanoTime();
		for(int i = list2.size() -1; i > -1; i--) { // 시작값을 인덱스의 맨 마지막부터 시작해서 0까지 i값을 --해주면서 지워나간다.
													// for(int i = 0, length = list1.size(); i < length; i++) 이와같이 코드를 구성하면 인덱스의 길이는 계속해서 변화하기 때문에 Exception이 발생한다.
			list2.remove(i);
		}
		long end2 = System.nanoTime();
		
		System.out.println("나쁜 성능 삭제 소요시간 : " + (end1 - start1) + "ns");
		System.out.println("좋은 성능 삭제 소요시간 : " + (end2 - start2) + "ns");
		
		
		
		
		
		
		
		
	}

}
