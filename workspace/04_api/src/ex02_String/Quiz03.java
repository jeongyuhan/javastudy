package ex02_String;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 파일명과 확장자명 분리하기
		/*
		String fullname = "2021-03-10.jpg";
		String filename = fullname.substring(0, fullname.lastIndexOf(".")); // 2021-03-10
		String extname = fullname.substring(fullname.lastIndexOf(".") + 1); // jpg	
		
		System.out.println("파일명: " + filename);
		System.out.println("확장자명: " + extname);
		*/
		
		// 선생님이 푼 해답)
		String fullname = "2021-03-10.jpg";
		int idx = fullname.lastIndexOf(".");
		String filename =fullname.substring(0, idx);
		String extname = fullname.substring(idx + 1);
	
		System.out.println("파일명: " + filename);
		System.out.println("확장자명: " + extname);
		
		// 문제에 대한 내생각)
		// fullname.lastIndexOf(".") 처럼 기준이 되는 부분을 변수로 지정해서 코드가 깔끔해질 수 있게 만드는 연습 필요
		
		
		
		
		
		
	}

}

