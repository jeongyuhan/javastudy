package ex01_char;

import java.io.FileReader;
import java.io.IOException;

/*
	FileReader 클래스
	- FileWriter 클래스의 반대 역할 이라고 이해하면 된다.
	1. "문자 기반 + 입력 스트림" 이다. (Reader가 붙으면 입력 스트림이다.)
	2. 문자를 읽을 때 사용한다.
		1) 통신 : 상대방이 보낸 문자를 받을 때
		2) 파일 : 텍스트 파일을 읽을 때 
	3. 입력 메소드
		read() 
	4. 입력 단위
		char[], int
	5. 예외 처리가 필요하다.		
	6. 받아온 문자를 한 글자씩 읽어내려가다가 마지막에 도달하면 -1을 읽어낸다.
	   이것을 이용하여 while문의 코드를 짜낸다.
*/

public class FileReaderMainClass {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("text1.txt")) {
			// read() 메소드를 이용해서 읽기
			// read() 메소드는 int 타입이 기본이다.
			// while무한루프를 통해 읽어온다.
			/*
			  방법1) while (true) { 
			  int ch = fr.read(); // 읽은 문자가 저장되거나 -1이 ch에 저장된다. 
			  if(ch == -1) {
			   break; 
			  }
			  System.out.print((char)ch); // println (x) -> print (o) // ch는 int 타입으로 받아왔기 때문에 출력할 때는 (char)로 캐스팅을 해준다. }
			*/
			
			// 방법2)
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
