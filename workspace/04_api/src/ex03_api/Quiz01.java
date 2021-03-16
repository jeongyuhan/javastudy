package ex03_api;

public class Quiz01 {

	public static void main(String[] args) {
		
		// String과 StringBuilder의 성능 비교
		// 1 ~ 100000을 모두 연결한다.(1234567891011121314.......)
		// 각 클래스별로 연결에 소요된 시간을 ns(나노초) 단위로 출력해보자.
		
		
		//1. String
		String str = ""; // (문자열 연결이 목적이면 시작을 빈문자열로 한다.)
		long start1 = System.nanoTime();
		for(int n = 1; n <= 100000; n++) {
			str += n;
		}
		long end1 = System.nanoTime();
		System.out.println("String 경과시간 : " + (end1 - start1) + "ns");
		System.out.println("String 경과시간 : " + ((end1 - start1) /1000000000.0) + "초");
		
		// 2. StringBuilder
		StringBuilder sb = new StringBuilder("");
		long start2 = System.nanoTime();
		for(int n = 1; n <= 100000; n++) {
			sb.append(n); // append()메소드를 이용해서 연결해주는게 문제의 특징
		}
		long end2 = System.nanoTime();
		System.out.println("String 경과시간 : " + (end2 - start2) + "ns");
		System.out.println("String 경과시간 : " + ((end2 - start2) /1000000000.0 ) + "초");
		
		
		

	}

}
