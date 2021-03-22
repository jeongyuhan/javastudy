package ex17_Object.ex02;

public class MainClass {

	public static void main(String[] args) {

		Dog dog = new Dog("댕댕이");
		
		System.out.println(dog);
		System.out.println(dog.toString());
		// 위의 두개의 코드는 같은 코드이다. toString()는 자동으로 호출된다.
		
		// Object클래스의 toString()
		/*
			public String toString() {
				return getClass().getName() + "@" + hashCode(); // 클래스@메모리참조값
		}
		*/
		
		// Dog클래스의 toString() - 오버라이드하여 Object클래스의  toString()이 아닌 Dog의 toString()을 사용한다.
		/*
			public String toString() {
				return "[name : " + name + "]";
			}
		*/
	}

}
