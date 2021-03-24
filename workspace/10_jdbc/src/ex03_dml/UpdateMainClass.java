package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class UpdateMainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "UPDATE staff SET department = ? WHERE no = ?";
			// 자바에서는 =(대입)과 ==(같다)를 구분하지만 DB에서는 구분하지않는다.
			ps = con.prepareStatement(sql);
			ps.setString(1, "영업");
			ps.setInt(2, 3);
			int result = ps.executeUpdate();
			if(result == 0) {
				System.out.println("정보가 수정되지 않았습니다.");
			} else {
				System.out.println("정보가 정상적으로 수정되었습니다.");
			}
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
		
		// UPDATE는 여러번 실행해도 가장 최근의 데이터를 최신화시키는 코드이기 때문에 문제없이 실행이 계속해서 된다.
		
	}

}
