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

		Integer a = 10;
		System.out.println("a의 HashCode : " + a.hashCode());
		
		Double b = 1.5;
		System.out.println("b의 HashCode : " + b.hashCode());
		
		String str = "hello";
		System.out.println("str의 HashCode : " + str.hashCode());
		
		// 지금까지 살펴본 바
		// 내장된 클래스타입의 객체들은 나름의 HashCode가 있다.
		
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog);
		System.out.printf("%x\n", dog.hashCode()); // Object의 hashCode이다.
		
		System.out.println(cat);
		System.out.printf("%x\n", cat.hashCode()); // Object의 hashCode이다.
		
		// 중요!
		// Object의 hashCode는 객체의 메모리 주소를 반환한다.
		// Object의 hashCode는 모든 객체가 다르다.
		// Object의 hashCode는 제 역할을 수행하지 못하기 때문에 따로 만들어서 사용한다.
		
		
		// HashSet과 HashMap의 공통점은 
		// "중복이 불가능한 데이터"가 있다는 점이다.
		
		// 중복 확인 유무
		// 1. hashCode 확인(hashCode())한다. hashCode가 같아야 다음 단계로 진행한다.
		// 2. 실제로 같은지 equals() 메소드로 비교한다. 
		// 3. 그 결과가 같으면 "중복 데이터"가 있는 것으로 판단한다.
		
		
	}

}

// main() 안에서 객체를 만들기위해 만들어둔 클래스
// package내용물을 늘리지 않기위해 간단하게 만들어둔 클래스이다.
class Dog {  }
class Cat {  } 