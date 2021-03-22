package ex08_static;

// 인스턴스 == 객체 

public class Korean {

	// field
	String name; // 인스턴스 필드 (인스턴스 마다 다르다.(사람마다 이름이 다르다는 의미))
	static final String COUNTRY = "한국"; // 클래스 필드 (모든 인스턴스가 동일하다.)
	
	// 인스턴스가 10개 있다고 가정하면,
	// 메모리에 name은 10개가 있고, country는 1개가 있다.
	// static처리를하면 메모리에 모든 인스턴스의 공용 데이터가 1개 생기는 것이다.
	
	
}
