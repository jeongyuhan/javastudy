package ex09_upcasting;

public class MainClass {

	public static void main(String[] args) {

		// upcasting을 사용하지 않은 경우
		// => 타입이 다르다 : 커피마다 커피를 담는 컵이 다르다.
		// 다른 타입에 만들어지는 내용도 다르다 == 각기 다른 컵에 다른 커피를 담는다.
		Espresso espresso = new Espresso("콜롬비아", 30);
		Latte latte = new Latte("인도네시아", 30, 150);
		espresso.info();
		espresso.taste();
		latte.info();
		latte.taste();
		
		System.out.println("=======================================");
		
		// upcasting을 사용한 경우
		// => 타입이 같다 : 모든 커피를 같은 컵에 담는다.
		// 같은 타입에 만들어지는 내용만 다르다 == 같은 컵에 다른 커피를 담는다.
		// 따라서 upcasting을 사용하면 관리에 용의하다.
		// 결론적으로는 Coffee배열을 이용하여 담기만하면 된다.
		Coffee coffee1 = new Espresso("콜롬비아", 30);
		Coffee coffee2 = new Latte("인도네시아", 30, 150);
		coffee1.info();
		coffee1.taste();
		coffee2.info();
		coffee2.taste();
		
		
		// 이렇게 같은 코드가 상황에 따라 다른 역할을 하는 것이 upcasting의 장점이고 이것이 상속을 하는 이유이다.
		
	}

}
