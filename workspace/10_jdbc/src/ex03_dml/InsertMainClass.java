package ex03_dml;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
import java.sql.*; // java.sql에 있는 모든 클래스를 import 한다.

import connection.DBConnection;

public class InsertMainClass {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff (no, name, department, hireDate) VALUES(1, 'alice', '총무', '21/03/22')";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			// executeUpdate() 메소드 반환 값
			// -> 변화가 생긴 행(Row)의 개수가 반환된다.
			// 실패하면 0이 반환되고, 성공하면 INSERT된 행(Row)의 개수가 반환된다.
			if (result == 0) {
				System.out.println("행이 추가되지 않았습니다.");
			} else {
				System.out.println("정상적으로 행이 추가되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {ps.close();}
				if (con != null) {con.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// PRIMARY KEY의 특성상 중복이 불가하기 때문에 첫번째 실행은 정상적으로 작동하여 추가되었지만,
		// 다시 실행하게 되면 PRIMARY KEY의 값이 중복되기 때문에 문제가 발생한다. 
		
		
	}

}
