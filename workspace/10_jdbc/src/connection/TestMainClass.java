package connection;

import java.sql.Connection;

public class TestMainClass {

	public static void main(String[] args) {
		
		// DBConnection 클래스의 getConnection() 메소드를 호출한다.
		// getConnection() throws Exception 이므로 try-catch 처리한다.
		
		try {
			//DBConnection connection = new DBConnection(); // new를 하면 모두 다른 객체가 만들어지는데 결국 DBConnection의 내용은 모두 같기 때문에 추천하지 않는다.
			//Connection con = connection.getConnection();
			// =======클래스 메소드 getConnection() ========
			// 클래스 메소드 처리는 static으로 한다. static 처리는 getConnection()메소드가 만들어진 DBConnection클래스에서 이뤄진다.
			Connection con = DBConnection.getConnection();
			
			System.out.println("DB에 접속되었습니다.");
			con.close();
			System.out.println("DB 접속이 해제되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
