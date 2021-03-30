package quiz01;

/*
	슈퍼클래스 : Weapon (내용이 없는 클래스)
	서브클래스 : Gun
*/

public class MainClass {

	public static void main(String[] args) {

		// 변경이 필요하면 알아서 변경
		/*
		Gun gun1 = new Gun("베레타", 10);
		Thread g1 = new Thread(gun1);
		Gun gun2 = new Gun("콜트", 10);
		Thread g2 = new Thread(gun2);
		*/
		Thread gun1 = new Thread(new Gun("베레타", 10));
		Thread gun2 = new Thread(new Gun("콜트", 10));
		
		
		gun1.start();
		gun2.start();
		
		// 실행 예시
		// 콜트 1발 쐈다.
		// 콜트 2발 쐈다.
		// 베레타 1발 쐈다.
		// ...
		
		
	}

}
