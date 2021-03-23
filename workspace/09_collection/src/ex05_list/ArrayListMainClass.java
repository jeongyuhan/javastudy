package ex05_list;

import java.util.ArrayList;
import java.util.List;

/*
	ArrayList 클래스
	1. List 인터페이스를 구현한 클래스이다.
	2. 생성방법
		1) ArrayList<E> list = new ArrayList<E>();
		2) List<E> list = new ArrayList<E>();
	3. 배열을 구현한 클래스이다. 자동으로 길이를 조정한다.
	4. 장점 : 순차적인 접근이 빠르다.
	5. 단점 : 중간 위치에 추가/삭제가 느리다.
	
	- ArrayList는 한번 배열을 만들어놓고 내용이바뀌지않는 추가/삭제가 별로없는 시스템에서 좋은 성능을 낸다.
*/

public class ArrayListMainClass {

	public static void main(String[] args) {
	
		// 1. 생성
		List<String> list = new ArrayList<String>(); // new 뒤에는 무조건 ArrayList를 적어야한다.
		
		
		// 2. 요소 추가
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		list.add("둘리");
		list.add("띠띠뽀");		
		// 순서대로 추가하려면 일반 add(String s)를 사용하고
		// 저장할 위치의 인덱스를 지정하여 저장하려면 add(int index, String s)을 사용한다.
		
		
		// 3. 삭제
		list.remove(0);
		list.remove("짱구");
		// remove(int index)는 인덱스번호에 저장된 요소를 삭제시키는 방법
		// remove(Object o)는 저장되어있는 요소를 직접 적어 삭제시키는 방법 
		
		
		// 4. 크기
		System.out.println("list의 길이 : " + list.size());
		
		
		// 5. 포함 여부 확인 (저장된 데이터 요소 확인)
		if(list.contains("둘리")) {
			System.out.println("둘리가 있습니다.");
		} else {
			System.out.println("둘리가 없습니다.");
		}
		// contain(Object o)는 찾고 싶은 요소를 적으면 찾아준다. 
		// 배열의 경우 for문을 추가하여 찾아내지만 list는 따로 for문 코드작성 없이 스스로 돌려 찾아낸다.
		
		
		// 6. 요소 가져오기
		System.out.println("첫 번째 요소 : " + list.get(0));
		// get(int index)를 사용하여 저장된 요소를 불러낸다.
		System.out.println("마지막 요소 : " + list.get(list.size()-1));
		// list안에 저장된 요소가 몇개인지 모를 때 마지막 요소를 불러내려면 list의 길이 -1 을 불러내면 마지막 요소의 인덱스가 된다.
		
		
		// 7. 전체 순회
		
		// 1) 일반 for문
		int length = list.size(); // 성능을 위해 size() 메소드 호출을 1번만 진행하도록 변수에 저장해둔다.
		for(int i = 0; i < length; i++) {
		// for(int i = 0, length = list.size(); i < length; i++) {  // int length = list.size();부분을 for문의 매개변수 자리에 넣어서 한번에 사용하는 방법도 있다.
			System.out.println((i+1) + "번째 요소 : " + list.get(i));
		}
		// list.size()가 반복되는 상황에서 성능적인 부분이 느리기 때문에 수정하는 것이 좋다.
		// 변수를 미리 따로 저장해두어 성능에 영향을 주는 size() 메소드를 한번만 호출한뒤 그값을 가져다 쓸 수 있도록 해준다.
		
		// 2) 향상 for문
		for(String element : list) {
			System.out.println(element);
		}
		
		
		// 8. 출력
		System.out.println("한 번에 출력 : " + list); // 이미 list에는 toString()과 같은 출력형태는 만들어져 있다.
		
		
		// 9. 초기화
		list.clear(); // clear() 메소드를 사용하면 전부 지워진다.
		System.out.println(list);
		
		
	}

}
