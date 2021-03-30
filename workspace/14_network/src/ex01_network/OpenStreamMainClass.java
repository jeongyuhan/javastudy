package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenStreamMainClass {

	public static void main(String[] args) {
		
		URL url = null;
		HttpURLConnection con = null;
		InputStreamReader isr = null; // text기반의 Stream Reader 사용
		BufferedReader br = null; // 속도 향상을 위한 BufferedReader 사용(BufferedReader를 사용할 경우 InputStreamReader를 사용하지 않아도된다.)
		StringBuilder sb = new StringBuilder();
		
		try {
			url = new URL("https://m.naver.com/"); // 네이버 모바일
			con = (HttpURLConnection) url.openConnection();
			isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);
			
			while(true) {
				String line = br.readLine(); // readLine() : 한 줄씩 읽어오는 메소드
				if(line == null) {
					break;
				}
				sb.append(line).append("\n");
			}
			System.out.println(sb.toString().length()); // 읽어들인 파일의 글자수
			
			// finally가 귀찮을 때
			// br.close();
			// con.disconnect();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {br.close();}
				if(con != null) {con.disconnect();}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
