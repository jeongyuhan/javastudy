package ex11_abstract;

// 1. 추상메소드
//	  1) 본문이 없는 메소드이다.
//    2) 메소드를 정의할 때 abstract 키워드를 앞에 추가한다.
//    3) 중괄호({})를 빼고 세미콜론(;)을 붙인다.

// 2. 추상클래스
//    1) 추상메소드가 1개이상 포함된 클래스이다.
//    2) 클래스 정의 앞에 abstract 키워드를 추가한다.

public abstract class Staff { // abstract public 으로 순서를 변경해도 상관없다.

	// field 
	private String name;

	// constructor
	public Staff(String name) {
		super();
		this.name = name;
	}
	
	// method
	public void info() {
		System.out.println("직원명 : " + name);
	}
	
	// 필요에 의해 추가하였지만 무엇을 return 해주어야 하는지 상황마다 다르기 때문에
	// 반환 할 수 있는 값은 없다.
	// public int getPay() {
	//		return ????;
	// }
	// 이런경우 본문이 없는 getPay() 메소드를 만들면 된다.
	public abstract int getPay(); // abstract public 도 가능하다. 둘의 순서는 상관없다.
	
	
	
	
	
	
	
}
