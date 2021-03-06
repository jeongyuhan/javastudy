package quiz07;

import java.util.Scanner;

public class Player {

	// field
	private String name;
	private Scanner sc = new Scanner(System.in); // scanner도 field에서 선언해둔다.
	
	// constructor
	public Player(String name) {
		this.name = name;
	}

	//method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int play() {
		System.out.println(name + "'s game start!");
		System.out.println("Press Enter!");
		// Enter입력 : nextLine() 을 사용하면 된다.(Enter를 누를 때까지 입력받는다.)
		sc.nextLine();
		long start = System.currentTimeMillis(); // 처음 Enter를 누른 시간을 재준다.
		System.out.println("After 10seconds Press Enter!");
		sc.nextLine();
		long end = System.currentTimeMillis(); // 두 번째 Enter를 누른 시간을 재준다.
		// 경과시간반환
		return (int)((end - start) / 1000);
	}
	
	
	
}
