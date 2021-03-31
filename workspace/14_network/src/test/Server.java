package test;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		ServerSocket server = null;
		Socket client = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			
			while(true) {
				System.out.println("====서버 동작중====");
				client = server.accept();
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트 : [" + isa.getHostName() + "]");
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
