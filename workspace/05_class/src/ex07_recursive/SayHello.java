package ex07_recursive;

public class SayHello {

	public void say(int n) {
		if(n > 0) {
			System.out.println("Hello");
			say(n-1); //재귀적 호출 (자신을 다시 실행시키는 것)
		} 
	}
	
	
}
