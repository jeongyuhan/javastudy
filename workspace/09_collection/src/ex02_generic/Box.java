package ex02_generic;

// 제네릭의 일반화 타입은 관례상 "영문대문자"를 사용한다.

public class Box<T, U> { // 2개이상의 제네릭은 <> 안에서 ,를 사용하여 추가해준다.

	// field
	private T item1;
	private U item2;

	// method
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	}
	
	
	
	
	
}
