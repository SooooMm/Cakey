package user;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private static Connection conn;
	private PreparedStatement pstmt;
	private CallableStatement cstmt;
	private ResultSet rs;
	//private static UserDAO userdao = new UserDAO();
	
	
		String url ="jdbc:mysql://localhost/users";
		String pw = "Suy0Sm0tdo";
		String name = "root";
	
		public UserDAO() {
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conn = DriverManager.getConnection(url, name, pw);
			
				if(conn != null) System.out.println("¼º°ø");
				else System.out.println("¤Ì");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	/*
	 * public static UserDAO getDatabaseInstance() { return userdao; } public
	 * Connection getThecConnectionObject() { return conn; }
	 */
		
	
}
