package ex01_network;

import java.net.URL;

public class URLMainClass {

	public static void main(String[] args) {

		// URL : Uniform Resource Locator
		// 형식이 정해져 있는 자원의 표기방법
		// 프로토콜://호스트:포트?파라미터

		URL url1 = null;
		URL url2 = null;
		
		try {
			url1 = new URL("https://www.naver.com?query=java");
			// ? 뒤쪽은 쿼리문을 인식하는 부분이다. (무엇인가를 요청할때 사용한다.(ex) 검색할때 사용))			
			System.out.println(url1.getHost()); 		// www.naver.com
			System.out.println(url1.getDefaultPort());	// 443
			System.out.println(url1.getProtocol());		// https
			System.out.println(url1.getQuery());		// query=java
		
			url2 = new URL("https://www.naver.com/webtoon/webtoon.jsp");
			System.out.println(url2.getFile()); // /webtoon/webtoon.jsp
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
