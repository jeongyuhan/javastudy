package ex03_File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_FileReader {

	public static void main(String[] args) {

		File file = new File("C:\\MyTemp\\text.txt");

		try (FileReader fr = new FileReader(file)) {
			int ch = 0;
			while ((ch = fr.read()) != -1) { // fr이 종료되지 않았다면 fr에서 한글자를 읽어 ch에 저장합니다.
				System.out.print((char) ch); // ch는 int이기 때문에 코드값이 출력되어 char로 캐스팅하여 출력해주어야 정상출력이 된다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
