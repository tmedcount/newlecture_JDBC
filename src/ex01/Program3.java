package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String title = "TEST2";
		String content = "HAHAHA2";
		int id = 13;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "UPDATE NOTICE SET TITLE = ?, CONTENT = ? WHERE ID=?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "rufdml13");
		// Statement st = con.createStatement();
		// st.ex...(sql)
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, title);
		st.setString(2, content);
		st.setInt(3, id);
		
		int result = st.executeUpdate();
		
		System.out.print(result);
		
		st.close();
		con.close();		
	}

}
