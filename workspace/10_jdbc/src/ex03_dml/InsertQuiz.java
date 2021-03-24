package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertQuiz {

	public static void main(String[] args) {

		// 임의의 3명의 staff를 삽입하시오.
		// 반복문과 배열을 사용하시오.

		int[] noList = { 3, 4, 5 };
		String[] nameList = { "david", "james", "jack" };
		String[] departmentList = { "총무", "영업", "고객" };
		String[] hireDateList = { "21/03/18", "21/03/15", "21/03/20" };

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff VALUES (?, ?, ?, ?)"; // 한번 생성한뒤면 (칼럼1,....) 은 생략이 가능하다.
			ps = con.prepareStatement(sql);
			int result = 0;
			for (int i = 0; i < noList.length; i++) {
				ps.setInt(1, noList[i]);
				ps.setString(2, nameList[i]);
				ps.setString(3, departmentList[i]);
				ps.setString(4, hireDateList[i]);
				result += ps.executeUpdate(); // 정상적으로 실행되면 result에 += 1 이 되는 것이다.
												// 반대로 실패하면 result에 += 0 이 되는 것이다.
			}
			System.out.println("총" + result + "명의 staff이 삽입되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		
		
	}

}
