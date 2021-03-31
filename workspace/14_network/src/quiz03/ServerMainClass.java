package quiz03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass {

	public static void main(String[] args) {

		ServerSocket server = null;
		Socket client = null;
		BufferedReader br = null;
		BufferedWriter bw = null;	
		Scanner sc = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), 4966));
			
			System.out.println("=======서버 실행중=======");
			client = server.accept();
			InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
			System.out.println("접속 클라이언트 : [" + isa.getHostName() + "]");

			br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));		
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
			// out = new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8")); 으로 사용했다면 아래에서 // out.println(toClient); 로 처리하면 깔끔하다.
			sc = new Scanner(System.in);
			
			while(true) {
				String fromClient = null;
				fromClient = br.readLine(); // "\n"을 읽을때까지 read한다.
				if(fromClient == null) {
					System.out.println("Disconnect By Client!");
					break;
				}
				System.out.println("From Client>>>" + fromClient);
				
				System.out.println("To Client>>>");
				String toClient = sc.nextLine();
				bw.write(toClient + "\n"); // br.readLine()은 "\n"을 읽을때까지 실행하기 때문에 추가해준다.
				// out.println(toClient);
				bw.flush();
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(br != null) br.close();
				if(!server.isClosed()) {server.close();}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
