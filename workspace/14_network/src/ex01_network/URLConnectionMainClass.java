package ex01_network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionMainClass {

	public static void main(String[] args) {
	
		URL url = null;
		URLConnection con = null;
		
		try {
			url = new URL("https://www.naver.com");
			con = url.openConnection();
			System.out.println(con.getContent());	  // sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@52af6cff
			System.out.println(con.getURL());		  // https://www.naver.com
			System.out.println(con.getContentType()); // text/html; charset=UTF-8 (text/ 뒤에 붙은 html이 타입이다.)
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
		
		

	}

}
