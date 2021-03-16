package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		WeekScheduler week = new WeekScheduler(1); // 1주차 스케줄
		week.run();
		
		// 현재는 실행 후 0번을 실행하여 exit()로 실행을 종료하면 실행할 때 저장한 내용이 모두 초기화된다.
		// 따라서 실행을 종료해도 지속적으로 저장되게 해야 한다.
		// persistance : 데이터에 영속성(저장유지)을 부여하는 방법
		
		 
	}

}
