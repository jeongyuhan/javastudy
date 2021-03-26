package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
	FileWriter 클래스 (Writer : 문자(char)기반에 출력스트림)
	1. "문자 기반 + 출력 스트림" 이다. 
	2. 문자를 보낼 때 사용한다.
		1) 통신 : 상대방에게 문자를 보낼 때
		2) 파일 : 텍스트 파일을 만들 때 
	3. 출력 메소드
		write() 
	4. 출력 단위
		char[], String, int
	5. 예외 처리가 필요하다.	
*/

public class FileWriterMainClass {

	public static void main(String[] args) {

		FileWriter fw = null; // try-catch로 예외처리를 하기위해 밖에서 선언만 해준다.
							  // try에서 객체를 완성시키고, catch와 finally에서 try-catch문 밖에서 선언된 fw객체를 사용해야하기 때문이다.
		
		try {
			fw = new FileWriter("text1.txt"); // text1.txt 파일이 생성된다.
			// text1.txt 파일로 전송할 데이터 
			char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
			String str = " Java";
			int ch = '!'; // int는 정수 뿐 만 아니라 한개의 문자를 옮길 수 도 있다.
			// text1.txt 파일로 데이터 전송하기
			fw.write(cbuf);
			fw.write(str);
			fw.write(ch);
			// text1.txt 파일에 줄을 바꿔서 Nice to meet you! 를 넣어보자.
			fw.write('\n'); // 줄을 바꾸고 싶으면 줄바꿈 이스케이프 문자를 따로 넣어보내주면 줄을 바꿔준다.
			String str2 = "Nice to meet you!"; 
			fw.write(str2);
			System.out.println("text1.txt 파일이 생성되었습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
