package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int id = 20;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "DELETE NOTICE WHERE ID = ?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "newlec", "rufdml13");
		// Statement st = con.createStatement();
		// st.ex...(sql)
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		
		int result = st.executeUpdate();
		
		System.out.print(result);
		
		st.close();
		con.close();		
	}

}
