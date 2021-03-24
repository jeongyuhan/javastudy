package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	// method
	// 1. 결과타입 : Connection
	// 2. 메소드명 : getConnection
	// 3. 매개변수 : 없다.
	// 4. 예외처리 : ClassNotPountException, SQLException 
	//				 구체적인 예외를 모를 경우엔 Exception을 사용하면된다.
	
	// throws의 의미
	// getConnection() 메소드에서는 예외처리를 하지않고,
	// getConnection() 메소드를 호출하는 곳으로 예외를 던져서 처리하겠다는 의미.
	
	//public Connection getConnection() throws ClassNotFoundException, SQLException
	public static Connection getConnection() throws Exception { // 정적인 데이터 이므로 static 처리를해준다.
		Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver 파일을 메모리에 올리는 부분이다.
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	
}
