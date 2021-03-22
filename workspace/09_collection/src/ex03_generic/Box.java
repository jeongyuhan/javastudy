package ex03_generic;

import java.util.Arrays;

public class Box<T> {

	// field
	private T[] items; // private T[] items = new T[10]; 은 불가능하다. field는 먼저 진행되는 compile time에서 이뤄지고,
	                   // 배열을 완성시켜줄 값이 들어오는 new 작업은 이후에 이루어지는 run time에서 이뤄지기 때문에 T에 전달될 타입이 무엇인지 아직 모르기 때문에 불가능한 것이다.
					   // 이런 경우 해결책은 타입을 무엇이든 저장할 수 있는 Object를 사용하여 오류를 잡아준다.
	private int idx;
	
	// constructor
	public Box(int itemCount) {
		// items = new T[itemCount]; 코드 작성 시점에서는 T의 구체적인 종류를 알 수 없어서, 메모리 할당이 불가능하다.
		items = (T[])(new Object[itemCount]); // 생성을 위해 Object를 사용했지만, Object 배열 생성 뒤에는 캐스팅을 해줘야 한다.
	}
	
	// method
	public void addItem(T item) {
		if(idx == items.length) {
			System.out.println("Full");
			return;
		} 
		items[idx++] = item;
	}

	@Override
	public String toString() {
		String result = "";
		for(T item : items) {
			if(item != null) {
				result += item.toString(); // item.toString() == Fruit의 toString()
			}
		}
		return result;
	}
	
	
}
