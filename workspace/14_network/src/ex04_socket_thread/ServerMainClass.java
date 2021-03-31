package ex04_socket_thread;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		
		// 클라이언트들이 파일을 전송한다.
		// 파일 전송 작업은 Thread로 작성한다.
		
		ServerSocket server = null;
		Socket client = null;
		
		try {
			server = new ServerSocket();
			server.bind(InetSocketAddress.createUnresolved("localhost", 4966));
			
			while(true) {
				
				// 클라이언트들의 접속 처리
				client = server.accept();
				
				// 클라이언트들의 파일 전송
				FileUploadThread upload = new FileUploadThread(); // thread 생성
				upload.setClient(client); // client를 통한 스트림 생성이 필요하므로 thread에 전달해준다.
				upload.start(); // thread 실행
						
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(!server.isClosed()) {
					server.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
