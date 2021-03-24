package ex01_generic;

public class MainClass {

	public static void main(String[] args) {
	
		Box<String> box1 = new Box<String>(); // 구체화가 진행(Box의 모든 T가 String으로 변환된 뒤 실행된다.)
		// Box<String> box1 = new Box<>(); 같은 코드이다.(구체화는 한번만 진행되면 된다. 뒤쪽<>안은 생략이 가능하다.)
		
		box1.setItem("헬로");
		System.out.println(box1.getItem());
		
		
		// 주의사항.
		// 제네릭 타입의 구체화는 "기본자료형"의 사용이 불가능하다.	(int(x))
		// 제네릭 타입의 구체화는 "참조자료형"만 가능하다.			(Integer(o))
		// "기본자료형"이 필요한 경우 해당 wrapper class를 사용한다.
		Box<Integer> box2 = new Box<Integer>();
		// Box<Integer> box2 = new Box<>();
		box2.setItem(100);
		System.out.println(box2.getItem());
		
		Box<Fruit> box3 = new Box<Fruit>();
		box3.setItem(new Fruit("apple", 1000)); // setItem()에 들어가는 매개변수가 Fruit인 것이고 매개변수 자리에서 생성자를 생성해주면서 값을 전달해주는 것이다.
		System.out.println(box3.getItem());
		
		
		/*
			class Box {
				Object obj;
			}
			
			Box box = new Box(); // String을 저장하기로 함
			box.setItem(1000); // Object의 경우 String을 저장하기로 해놓고 다른 타입을 저장하더라도 오류가 발생하지 않는다.
			
			하지만, 제네릭 타입의 경우 String으로 지정하고 난 뒤 다른타입을 저장하려고하면 오류가 발생한다.		
		*/
	}

}
