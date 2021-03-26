package ex01_char;
/*
	Buffered Writer 클래스
	1. 보조 스트림이다.
	2. FileWriter 클래스와 같은 메인 스트림과 함께 사용하는 보조 스트림이다.
	3. 내부 Buffer를 이용해서 동작 속도를 향상 시킬 수 있다. 
*/
/*
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
*/
import java.io.*;
public class BufferedWriterMainClass {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("text3.txt");
			bw = new BufferedWriter(fw); // 메인을 만들고 그 메인의 속도를 향상시키기위해 커버를 씌워 사용한다.
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 보조 스트림 bw를 사용할 때는 bw만 close() 해주면된다.
			try {
				if(bw != null) {
					bw.close();
				}
			} catch(Exception e) {
				e.printStackTrace();			
			}
		}
		
		
	}

}
