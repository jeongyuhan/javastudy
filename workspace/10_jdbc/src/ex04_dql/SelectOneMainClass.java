package ex04_dql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import connection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // SELECT문의 결과 행(Row)을 저장한다.
		
		try {
			con = DBConnection.getConnection();
			String sql = "SELECT no, name, department, hireDate FROM staff WHERE no = 2"; // unique 칼럼의 동등비교는 결과가 한개이다.(PRIMARY KEY)
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); // SELECT문의 실행은 executeQuery() 메소드이다. (executeUpdate() 메소드가 아니다.)
			// rs에 저장된 데이터는 "반드시" next() 메소드를 호출해서 꺼내야한다.
			// next() 메소드 
			// 1. 결과 행(Row)에서 순서대로 한 행(Row)씩 꺼낸다.
			// 2. 꺼낼 결과 행(Row)이 존재하면 true를 반환하고, 없으면 false를 반환한다.
			if(rs.next()) {
				// rs에서 하나씩 꺼내는 방법으로는 1) getInt(1) - 꺼낼 번호를 적거나 or 2) getInt("no") - 꺼낼 칼럼을 적는다.
				// rs.get타입(칼럼번호 or 칼럼명); 으로 꺼내준다.
				int no = rs.getInt(1); // rs.getInt("no");
				String name = rs.getString(2); // rs.getString("name");
				String department = rs.getString(3); // rs.getString("department");
				Date hireDate = rs.getDate(4); // rs.getDate("hireDate");
				System.out.println("no = " + no + ", name = " + name + ", department = " + department + ", hireDate = " + hireDate);				
				
				// HashMap에 저장하기
				Map<String, Object> staff = new HashMap<String, Object>();
				staff.put("no", rs.getInt("no"));
				staff.put("name", rs.getString("name"));
				staff.put("department", rs.getString("department"));
				staff.put("hireDate", rs.getDate("hireDate"));
				// 저장한 key값을 DB의 칼럼을 읽어오는 것이기때문에 칼럼의 이름이 변수이름이되고 그것이 키값이되는 식으로 연결해주는 것이 좋다.
				System.out.println("no = " + staff.get("no") + ", name = " + staff.get("name") + ", department = " + staff.get("department") + ", hireDate = " + staff.get("hireDate"));
				
			} else {
				System.out.println("해당 staff이 없습니다.");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}	
	
		
		
		
	}
}
