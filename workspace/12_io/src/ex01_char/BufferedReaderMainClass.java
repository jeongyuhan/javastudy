package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMainClass {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("text3.txt"))) {
			// 방법1)
			StringBuilder sb = new StringBuilder(); // String의 성능 향상을 위한 보조메소드()
			char[] cbuf = new char[5];
			while(true) {
				int readCharCount = br.read(cbuf);
				if(readCharCount == -1) {
					break;
				}
				sb.append(cbuf, 0, readCharCount); // 읽은 글자수만큼만 sb에 저장한다. 
			}
			System.out.println(sb.toString()); // toString()메소드를 사용해 출력하지않으면 주소값이 나온다.
		/*
			방법2)
			StringBuilder sb = new StringBuilder();
		 	char[] cbuf = new char[5];
		 	int readCharCount = 0;
		 	while( (readCharCount = br.read(cbuf)) != -1) {
		 		sb.append(cbuf, 0, readCharCount);	
		 	}
		 	System.out.println(sb.toString());
		 */
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
