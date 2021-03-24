package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {

	public static void main(String[] args) {
	
		// jdbc 부분들은 전부 다 외워야 시험 통과할 수 있다.  
		
		// 1. oracle.jdbc.driver.OracleDriver 클래스를 메모리에 올린다.
		// 무조건 경로는 풀네임으로 적어야한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException 발생 가능. 
			// 대부분 문제없는 코드에서 오류가 발생할 때는 예외가 발생한다고 보면된다.			
			
			// 2. 접속 정보
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // Oracle 11g Express Edition(thin driver)용 
															 	// DB서버 주소 : IP주소 : 127.0.0.1 (==localhost(내pc를 의미한다.)) 
			String user = "spring"; // 대소문자 구분 없다.
			String password = "1111";
			
			// 3. 접속
			// DriverManager 클래스가 접속을 담당하고,
			// getConnection()을 이용해 접속 정보를 받아온다.
			// 접속 결과는 Connection 인터페이스에 저장한다.
			Connection con = DriverManager.getConnection(url, user, password); // SQLException 발생 가능.				
			
			// 4. 접속이 성공하면 여기로 도착
			System.out.println("DB에 접속되었습니다.");
		
			// 5. 접속 종료
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
