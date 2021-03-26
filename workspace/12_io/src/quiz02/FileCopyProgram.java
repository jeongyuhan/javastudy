package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Download에 사용되는 FileCopy

public class FileCopyProgram {

	public static void main(String[] args) {
		
		// 다운로드 프로그램 만들기
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("ground.mp4"));		// 원본
			bos = new BufferedOutputStream(new FileOutputStream("ground2.mp4"));	// 복사본
			byte[] b = new byte[1024]; // 1KB 씩 옮기기 위한 작업 1024byte == 1KB
			while(true) {
				int readByte = bis.read(b); // 영상 저장은 b, 실제 읽은 byte수는 readByte에 저장되어있다.
				if(readByte == -1) {
					break;
				}
				bos.write(b, 0, readByte);
			}
			System.out.println("ground.mp4 파일이 복사되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
				if(bis != null) bis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
