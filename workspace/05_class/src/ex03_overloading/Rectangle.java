package ex03_overloading;

/*
	오버로딩(overloading)
	1. 이름이 같고, 매개변수가 다른 메소드가 있음을 의미한다.
 	2. 결과타입은 오버로딩과 상관이 없다.	
 	   이름이 같고 결과타입이 다른 메소드는 만들수가 없다.
*/

public class Rectangle {

	// field
	int width;	// 너비
	int height;	// 높이
	
	// method
	void set(int w, int h) {
		if(w>0) {
			width = w; //> 0 ? w : 0 ;			
		} //else {
	      //width = 0;     int 에는 0이 초기화되어있기 때문에 불필요한 코드이다.
		  //}
		if(h > 0) {
			height = h; //> 0 ? h : 0;			
		}
	}

	void set(int n) {
		// 다른 set() 메소드를 호출해서 처리한다.
		set(n,n); // 지금 사용된 set() 메소드가 호출되면 위에 if문이 모두 추가된 set(int w, int h) 메소드가 호출이되어 처리된다.
	}
	
	int gerArea() {
		return width * height;
	}
	
	
}
