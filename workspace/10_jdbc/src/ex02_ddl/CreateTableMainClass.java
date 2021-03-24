package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class CreateTableMainClass {

	public static void main(String[] args) {

		// 모든 데이터베이스 작업의 시작은 "접속"이다.
		Connection con = null;
		PreparedStatement ps = null;
		try {
			// 1. 접속
			//Connection 
			con = DBConnection.getConnection();
			
			// 2. 쿼리문을 미리 준비한다.(PreparedStatement 클래스를 사용하므로)
			// 키워드는 대문자, 테이블/칼럼은 소문자로 작성하여 공부할때 보기 편하게 사용해보자.
			// 줄바꿈 문자는 +를 이용한다.
			String sql = "CREATE TABLE staff (" + 
						 "no NUMBER PRIMARY KEY," +
						 "name VARCHAR2(100)," +
						 "department VARCHAR2(100)," +
						 "hireDate DATE" + 
						 ")";
			
			// 3. 쿼리문 처리를 위한 PreparedStatement ps 객체 생성
			// new를 사용하지 않는다.
			//PreparedStatement 
			ps = con.prepareStatement(sql);
			
			// 4. 쿼리문을 실행
			ps.executeUpdate();//(executeUpdate - PreparedStatement 를 사용한다.)
			System.out.println("staff 테이블이 생성되었습니다.");
			
			// 5. 자원(리소스) 반납
			//ps.close();
			//con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	
		
		
	}

}