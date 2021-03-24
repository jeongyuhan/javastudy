package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class DeleteMainClass {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "DELETE FROM staff WHERE department = '영업'";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			if(result == 0) {
				System.out.println("삭제된 정보가 없습니다.");
			} else {
				System.out.println(result + "명의 정보가 정상적으로 삭제되었습니다."); // 입력한 WHERE의 조건식에 만족하는 값이 2개가 되면 result는 2가 되는 것이다.
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
