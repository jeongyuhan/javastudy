package ex01_user_type;

public class MainClass {

	public static void main(String[] args) {
		
		// 클래스 Person을 타입으로 하는 "객체"를 생성한다.
		
		// 생성 방법
		/*
		 *  1. 타입 : Person
		 *  2. 객체 : p1
		 */
		Person p1 = new Person();
		
		// 클래스에 포함된 멤버(필드, 메소드)는 마침표(.)로 호출한다.
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.gender);
		System.out.println(p1.isKorean);
		// 필드의 초기화상태는 암기하는 것이 좋다.
		
		// Person은 reference type 이다.
		System.out.println(p1); // new Person()으로 생성된 객체의 "주소(참조)"가 저장되어 있다.
		
		Person p2 = p1; // p2는 객체 p1의 "주소(참조)"를 그대로 가지고 있다.
		System.out.println(p2);
		
		// p2를 수정하면 어떤 일이 벌어질까?
		p2.name = "alice";
		
		System.out.println(p2.name); // 당연히 alice
		System.out.println(p1.name); // 왜 alice가 되었을까?
		// 하나의 객체를 관리하는 두개의 참조변수가 존재하게 된 것이고,
		// 두개의 참조변수중 한개를 수정할 경우 나머지 한개의 참조변수는 수정된 객체를 받아들이게 되는 것이다.
		// 결론적으로 같은 객체의 주소(참조)값을 가지는 여러개의 참조변수들은 어디서 수정이되던 같은 값을 받아들이게 된다.
		// Person이라는 객체는 한개이고, 이를 사용하는 p1 p2라는 참조변수들이 2개인것이다.
		
		
		
		Person p3 = p2;
		p3.age = 20;
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		// 하나의 객체에는 몇개의 참조변수들이 생기던 괜찮은듯하다. 관리만 잘하면 가능할듯.

	}

}
