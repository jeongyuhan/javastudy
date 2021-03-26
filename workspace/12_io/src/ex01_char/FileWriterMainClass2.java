package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*	
	try-catch-resources문
	1. close() 메소드를 자동으로 호출하는 try문이다. (finally부분을 생략할 수 있다.)
	2. 형식
		try (스트림 생성) {
			본문
		} catch () {
			본문
		}

*/

public class FileWriterMainClass2 {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("text2.txt")) {
			char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
			// fw.write(cbuf, 0, 1); // ()안의 내용을 해석하면 cbuf 배열의 0번 인덱스부터 1개를 보내시오.
			fw.write(cbuf, 0, cbuf.length); // ()안의 내용을 해석하면 cbuf 배열의 0번 인덱스부터 cbuf길이(전체)만큼 보내시오.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
