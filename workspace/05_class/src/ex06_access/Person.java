package ex06_access;

// 접근제어자(access modifier)
// 1. private : 클래스 내부에서만 볼 수 있음을 의미.
// 2. default : 같은 패키지에서만 볼 수 있음을 의미. access modifier를 지정하지 않으면 default이다.
// 3. protected : 같은 패키지 또는 상속 관계에 있는 다른 패키지에서만 볼 수 있음을 의미.
// 4. public : 어디서든 볼 수 있음을 의미.

// 지정하는 방법
// 1. 필드는 private한다.
// 2. 메소드(일반 메소드, 생성자)는 public한다.

// 클래스의 주목적은 필드값을 안전하게 저장하는 것이다.
// 가장 완벽한 방법은 정보은닉이다.
// 정보은닉을한 필드값을 밖에서(필드를 만든 클래스 이외의 클래스) 사용하려면 따로 만든 접근통로를 이용해 사용하면서 안전성을 높인다.
// 접근통로는 그에따른 메소드를 생성하여 메소드를 사용함으로써 필드값을 사용할 수 있도록 하는 것이다.

public class Person {

	// field
	private String name;
	private int age;
	private boolean isKorean;
	private char gender;
	// constructor
	
	// method 
	
	// 1. 필드에 값을 전달하는 메소드 : setter
	// 2. 필드 값을 반환하는 메소드 : getter	
	
	// name에 접근할 수 있는 메소드
	// 1. name에 값을 전달할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	// 2. name을 반환하는 메소드
	public String getName() {
		return name;
	}
	
	// age에 접근할 수 있는 메소드
	// 1. age에 값을 전달할 수 있는 메소드
	public void setAge(int age) {
		this.age = age;
	}
	// 2. age를 반환하는 메소드
	public int getAge() {
		return age;
	}
	
	// isKorean에 접근할 수 있는 메소드
	// 1. isKorean에 값을 전달할 수 있는 메소드
	public void setKorean(boolean isKorean) {
		this.isKorean = isKorean;
	}
	// 2. isKorean을 반환하는 메소드
	public boolean isKorean() {
		return isKorean;
	}
	
	// gender에 접근할 수 있는 메소드
	// 1. gender에 값을 전달할 수 있는 메소드
	public void setGender(char gender) {
		this.gender = gender;
	}
	// 2. gender를 반환하는 메소드
	public char getGender() {
		return gender;
	}
	
	// getter와 setter를 자동으로 만들어주는 메뉴
	// Source - Generate Getter and Setters...를 사용하면 만들어준다.
}
