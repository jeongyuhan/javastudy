package ex02_byte;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	DataOutputStream 클래스
	1. 자바의 데이터 타입 그대로 출력하는 클래스
	2. 출력 메소드
		writeByte(), writeInt(), writeLong(), writeDouble() 등 타입별로 처리할 수 있다.
*/

public class DataOutputStreamMainClass {

	public static void main(String[] args) {

		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("byte3.dat"));
			int age = 44;
			double weight = 55.5;
			String name = "정유한";
			
			dos.writeInt(age);
			dos.writeDouble(weight);
			dos.writeUTF(name);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// 실행결과가 다른 파일들과 다르게 나올것이다. 만들어놓은 파일을 더블클릭하여 열어보면 정상적이지 않은 결과가 나오는데
		// DataOutputStream의 경우 열어보는 코드를 같이 알아두어야 한다.
		
		
	}

}
