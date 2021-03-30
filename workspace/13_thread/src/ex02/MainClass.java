package ex02;

public class MainClass {

	public static void main(String[] args) {
		
		// Runnable 인터페이스를 구현한 thread는 
		// 1. 생성
		// 2. Thread로 변경
		// 과정을 거친다.
		
		Player p1 = new Player("짱구");
		Thread player1 = new Thread(p1);
		
		Player p2 = new Player("맹구");
		Thread player2 = new Thread(p2);
				
		// player1, player2가 thread이다.
		player1.start();
		player2.start();
		
		
		
	}

}
