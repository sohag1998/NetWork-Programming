import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pust_ice", "root", "Sohag@13579");
		System.out.println("Connection Eslablished");
		
		
		stmt = conn.createStatement();
		
		String sql = "INSERT INTO pust_ice "+
				"VALUES (3, 'Mizan')";
		
		stmt.executeUpdate(sql);
		
		System.out.println("Insert Succesfully");
		
	}

}
