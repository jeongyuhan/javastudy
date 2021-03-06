package ex01_array;

/*
	배열(array) 
	1. 변수가 여러 개 필요할 때 사용한다.
	2. 같은 이름 + 식별 번호를 통해서 표현한다.
	3. 선언 방법
	   1) int[] a = new int[3]; // int타입 변수 3개를 사용할 수 있는 배열 a 생성
	   2) int[] a; 
	      a = new int[3]; // 1번을 분리해서 사용하는 방법
	   3) int a[] = new int[3]; // [] 을 int가 아닌 변수 뒤에 붙여주는 방법, 추천하진 않는다.
	                            // c언어의 스타일을 지원해주는 것 뿐 사용하지 않는 것이 좋다.
	4. 초기화 방법
	   1) int[] a = {10, 20, 30}; 
	   // 주의사항 : 아래와 같은 방법은 안된다. 초기화는 반드시 선언할 때 같이 진행한다. 배열생성할 때처럼 분리해서 사용이 불가능하다.
	   주의) int[] a;
	      a = {10, 20, 30}; 
	5. 생성되는 변수
	   int[] a = new int[3];
	   a[0] : 기본적으로 0으로 초기화가 되어있는 상태(자동)
	   a[1] : 기본적으로 0으로 초기화가 되어있는 상태(자동)
	   a[2] : 기본적으로 0으로 초기화가 되어있는 상태(자동)	
	   -위 변수 생성으로 만들어진 내용물은 세개다.
	6. 용어
	   int[] a = new int[3];
	   1) 배열이름 : a
	   2) 배열길이 : 3 (배열의 길이를 구하는 방법 = a.length)
	   3)  인덱스  : 0, 1, 2 (인덱스(식별번호)는 0부터 시작한다.)
	       사용이 불가능한 인덱스를 사용하면 ArrayIndexOutOfBoundsException 예외가 발생한다.						
	   
*/

public class Ex01_array {

	public static void main(String[] args) {
		
		// 1. 배열의 선언 및 생성
		int[] a = new int[3];
		
		// 2. 확인
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// 3. 배열의 순회
		// 인덱스가 기준이다.
		// 인덱스 : 0 ~ 길이 -1 --> 0 <= 인덱스 < 길이
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 4. 가용 범위를 벗어난 인덱스 사용할 경우
		System.out.println(a[3]); // Exception 발생
		
		

	}

}
