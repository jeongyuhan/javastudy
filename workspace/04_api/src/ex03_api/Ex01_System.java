package ex03_api;

public class Ex01_System {

	public static void main(String[] args) {

		// 1. 시스템 종료
		// System.exit(0);
		
		// 2. 현재 시간(타임스탬프)알아내기
		// timestamp : 1970-01-01 0:00:00 부터 현재까지 경과한 시간(단위 : 밀리초(1000분의 1초))
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		// 3. 현재 시간 알아내기
		//	    자바가 마음대로 결정한 기준일로부터 경과한 시간(단위 : 나노초(10억분의 1초)
		//    경과된 시간을 측정하는 용도
		//    (무언가 작업을 한다고하면 그작업을 수행하기 시작한 시간과 끝마친 시간을 비교하여 소요된 시간을 측정하는 용도) 
		long something = System.nanoTime();
		System.out.println(something);
		
		
		// 4. 배열 복사하기
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[10];
		
		System.arraycopy(a, 0, b, 0, a.length);
		// a[0]의 값을 b[0]로 복사를 시작하고 인덱스는 순차적으로 증가하며, 
		// a.length만큼 복사 작업을 반복 수행한다.(a배열에 있는 값을 모두 복사하고 남은 공간은 0으로 초기화 되어 있을 것이다.)
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
