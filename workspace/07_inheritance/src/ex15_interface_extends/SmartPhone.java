package ex15_interface_extends;

// 다중 상속 : extends와 implements를 동시에 사용할 수 있다.

public class SmartPhone extends Phone implements Computable {

	// Computable의 playApp()을 반드시 오버라이드 해야 한다.
	// Source - Override/implement Methods 를 사용한다.	
	@Override
	public void playApp() {
		System.out.println("앱을 실행한다.");
	}
	
	
}
