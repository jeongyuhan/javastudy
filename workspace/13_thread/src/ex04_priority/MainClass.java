package ex04_priority;

public class MainClass {

	public static void main(String[] args) {

		// Thread의 우선 순위
		System.out.println("가장 낮은 우선 순위 : " + Thread.MIN_PRIORITY);
		System.out.println("중간 우선 순위      : " + Thread.NORM_PRIORITY);
		System.out.println("가장 높은 우선 순위 : " + Thread.MAX_PRIORITY);
		
		Thread homework = new Thread(new Homework());
		Thread watchTV = new Thread(new WatchTV());
		
		// homework의 우선 순위를 높이고,
		// watchTV의 우선 순위를 낮춘다.
		homework.setPriority(Thread.MAX_PRIORITY);
		watchTV.setPriority(Thread.MIN_PRIORITY);
		
		// thread 시작
		// watchTV를 먼저 호출한뒤 실행해도 높은 확률로 homework가 먼저 실행된다.
		// 무조건 먼저 시작하게 되는 것은 아니다. 높은 확률일 뿐
		watchTV.start();
		homework.start();
		
	}

}
