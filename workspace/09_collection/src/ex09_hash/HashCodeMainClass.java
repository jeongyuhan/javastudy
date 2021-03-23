package ex09_hash;

/*
	몇몇 아이디가 있다.
	각각의 HashCode를 몇몇 규칙으로 생성해보자.
	1) 첫 글자에 따라서 HashCode를 정한다.
			 HashCode
	'apple'	 	1
	'africa'	1
	'avatar'	1
	'banana'	2
	'bonus'		2
	'bravo'		2
	
	2) 글자수에 따라서 HashCode를 정한다.
		     HashCode
	'apple'	 	5
	'africa'	6
	'avatar'	6
	'banana'	6
	'bonus'		5
	'bravo'		5
	입력된 아이디를 검색하고자 한다.
	검색 속도를 높이기 위해서 'hash' 개념이 사용된다.
	
	검색 예시)
	검색 아이디  : 'april'
	사용해시코드 : 글자수
	동작
		1) 'april'의 HashCode를 구한다.
		   ('april'의 HashCode는 5)
		2) HashCode가 5인 'apple', 'bonus', 'bravo' 중에서 'april'을 찾는다.
		검색할 검색어를 찾는 폭을 좁혀 더 빠르게 찾을 수 있도록 해준다.    
*/

public class HashCodeMainClass {

	public static void main(String[] args) {

		
		
		
		
	}

}
