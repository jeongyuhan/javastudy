package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		
		Socket client = null;
		Scanner sc = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		try {
			// 서버에 접속하기(아래 코드3줄이 실행되면 server클래스에 있는 accept이 풀리면서 진행된다.)
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속되었습니다.");
			
			// 서버에 메세지 보내기
			sc = new Scanner(System.in);
			System.out.print("서버에 인사말을 건네보세요.>>>");
			String message = sc.nextLine();
			//client.getOutputStream(); // byte기반 Stream은 String을 보낼 수 없기 때문에 String 타입의 message를 byte 타입으로 바꿔준뒤 보낸다.
			bos = new BufferedOutputStream(client.getOutputStream());
			bos.write(message.getBytes("UTF-8")); // 한글 처리를 위해 UTF-8 을 입력해준다.
			bos.flush(); // 혹시 남아있을 메세지를 강제로 밀어서 보내는 메소드
			
			// 서버가 보낸 답변 메세지 받기
			bis = new BufferedInputStream(client.getInputStream());
			byte[] b = new byte[1024];
			int length = bis.read(b);
			String answer = new String(b, 0, length, "UTF-8");
			System.out.println(answer);			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(bos != null) {
					bos.close();
				}
				if(!client.isClosed()) {
					client.close();}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
