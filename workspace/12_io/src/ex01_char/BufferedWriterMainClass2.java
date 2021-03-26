package ex01_char;

/*
	BufferedWriter를 사용할 때는 
	FileWriter fw = null;
	BufferedWriter bw = null; 
	위와 같이 두가지를 모두 선언하고 생성하는 것이 아니라
	BufferedWriter bw = new BufferedWriter(new FileWriter("text4.txt")) 같이 한번에 선언하고 생성하는 방식으로 사용한다.							 
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMainClass2 {

	public static void main(String[] args) {
	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("text4.txt"))) {
			bw.write("안녕하세요.");
			bw.newLine();
			bw.write("반갑습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
