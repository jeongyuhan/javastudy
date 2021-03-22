package ex08_static;

public class MyMath {

	// private 생성자 -> MyMath 내부에서만 생성이 가능하다.
	// 외부에서 new를 사용해 생성이 불가능하게 만든다.
	private MyMath() {}
	
	
	
	// field
	// 원주율 (클래스 필드) 
	public static final double PI = 3.141592; // 누구나 쓸 수 있고 static처리가 되어있으며 final로 변하지 않는 double타입의 PI
	// ex) Math.PI / Math.random() 등이 Math클래스를 통해 field와 method를 호출한 것이다.
	//     이것들은 모두 static처리로 만들어져있다.
	
	
	// method
	// 절대값(클래스 메소드)
	public static double abs(double n) {
		return (n > 0) ? n : -n ;
	}
	
	// 제곱값(클래스 메소드)
	public static double pow(double a, double b) { // a의 b제곱
		double result = 1; //곱하기를 반환하는 결과를 초기화 할때는 초기화값을 1로 잡아준다.
		for(int i = 0; i < b; i++) { // b만큼 곱하기를 진행한다.
			result *= a;
		}
		return result;		
	}
	
	
}
