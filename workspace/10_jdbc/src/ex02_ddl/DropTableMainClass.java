package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {

		// try{} 블럭과 finally{} 블럭 모두에서 con, ps를 사용하기 위해 try{}밖(main{}안)에서 선언해준다.
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConnection.getConnection();
			String sql = "DROP TABLE staff";
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("staff 테이블이 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
				// if문에서 실행코드가 1개 일경우 {}를 생략할 수 있다. 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
