package ex02_byte;

import java.io.FileOutputStream;
import java.io.IOException;

/*
	FileOutputStream 클래스 (Writer : 문자(char)기반에 출력스트림)
	1. "바이트 기반 + 출력 스트림" 이다. (Stream  Reader,Writer가 아닌 모든 것) 
	2. 모든 것을 보낼 때 사용한다.
		1) 통신 : 상대방에게 데이터를 보낼 때
		2) 파일 : 모든 파일을 만들 때 
	3. 출력 메소드
		write() 
	4. 출력 단위
		byte[], int (하나를 보낼 때는 int 여러개 보낼 때는 byte[])
	5. 예외 처리가 필요하다.	
	
	모든파일을 처리할 수 있는 것은 byte기반이기 때문에 대부분은 byte기반의 Stream을 사용하게된다. 
*/

public class FileOutputStreamMainClass {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("byte1.txt");
			String str1 = "Hello Java";
			String str2 = "안녕하세요. 반갑습니다.";
			int ch = '!';
			
			fos.write(str1.getBytes()); // String 타입을 byte타입으로 바꿔주는 메소드 getBytes()
			fos.write(ch);
			fos.write('\n');
			fos.write(str2.getBytes());
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
