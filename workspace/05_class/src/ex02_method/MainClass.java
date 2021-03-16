package ex02_method;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.set("alice", 30, '여', false, 163.1, 53.5); // set() 메소드의 매개변수로 전달해주는 인수가 4개
		/*
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.isKorean);
		*/
		
		//출력을 해주기위해 만든 info()메소드를 사용한다.
		p.info(); // 매개변수가 없기 때문에 전달할 인수가 없다.
		
		double bmi = p.getBMI();
		System.out.println(bmi);

	}

}
