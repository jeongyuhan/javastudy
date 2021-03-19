package ex06_exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpDown {

	// field
	private int answer; // 발생된 난수
	private int count;  // 시도한 횟수
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public UpDown() {
		answer = (int)(Math.random() *100) + 1; // 1 ~ 100의 사이의 난수 발생
	}
	
	// method
	public int challenge() throws UpDownException, InputMismatchException {
		count++;
		System.out.println("1 ~ 100 사이의 정수 입력 >>>>");
		int n = sc.nextInt(); // 입력이 int가 아니면 InputMismatchException이 발생한다. 
		if(n < 1 || n > 100) {
			throw new UpDownException();
		}
		return n;
	}
	
	public void play() {
		while(true) {
			try {
				int n = challenge(); // UpDownException, InputMismatchException이 발생되는 곳이다.			
				if(n < answer) {
					System.out.println("Up!");
				} else if(n > answer) { 
					System.out.println("Down!");
				} else {
					System.out.println("정답 " + answer + "를 맞혔습니다. (" + count + "번만에 정답)" );
					return; //play() 메소드 종료
				}
			} catch (UpDownException e) {
				System.out.println(e.getMessage()); // 1 ~ 100 사이의 값을 입력해야합니다.라고 만든 메시지를 출력해준다.
			} catch (InputMismatchException e) {
				// 정수가 아닌 값이 입력되는 경우
				// 그 값은 어디에도 저장되지 못하고 계속 입력에 남아있기 때문에 제거가 필요하다.
				sc.next(); // 입력 받는 변수는 없어도 된다. 사용목적이 저장이 아닌 잘못입력된 것을 처리해주기위한 목적이기 때문이다. 
				System.out.println(e.getMessage()); // null
			}
						
		}
	}
	
	
	
	
	
}
