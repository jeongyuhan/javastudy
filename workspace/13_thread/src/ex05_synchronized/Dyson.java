package ex05_synchronized;

/*
	critical section
	1. 임계 영역
	2. 공유 자원을 관리하기 위해서 한 번에 한 thread의 접근만 허용한다.
	   이러한 경우를 "thread safe 하다."라고 표현한다.
	3. synchronized 키워드로 추가한다.
*/

public class Dyson {

	// synchronized
	// 한 thread만 floorCleaning()나 homeCleaning에 접근할 수 있다. 
	// 동시 접근이 안된다.
	// method를 만들 때 public 뒤에 synchronized를 붙여주면 임계영역처리(동기화처리)가 된다.
	
	// method
	public synchronized void floorCleaning() {
		try {
			System.out.println("바닥 청소를 하고 있습니다.");			
			Thread.sleep(1000); // 1000밀리초(1초) 일시중지
			notify(); // 다른 thread에게 floorCleaning() 메소드가 끝났음을 알린다. 
			wait();   // 다른 thread가 notify() 할때까지 기다린다. 
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	public synchronized void homeCleaning() {
		try {
			System.out.println("집안 청소를 하고 있습니다.");
			Thread.sleep(1000);
			notify();
			wait();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
