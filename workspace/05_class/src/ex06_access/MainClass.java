package ex06_access;

public class MainClass {

	public static void main(String[] args) {
		
		// 클래스에 생성자가 없는 경우에는
		// "default" 생성자가 자동으로 사용된다. 
		// "default" 생성자는 생성할 때 아무것도 받아드리지 않게 되어있다.
		// "default" 생성자는 public Person(){   } 이렇게 생겼다. 
		
		Person p = new Person();
		
		p.setName("james");
		p.setAge(25);
		p.setKorean(false);
		p.setGender('남');
		
		System.out.println("이름: " + p.getName());
		System.out.println("나이: " + p.getAge());
		System.out.println(p.isKorean() ? "한국인" : "외국인");
		System.out.println(p.getGender());
		
		
		
		
	}

}
