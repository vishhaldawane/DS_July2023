import java.sql.Connection;
import java.sql.DriverManager; // all methods throws SQLException
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
			
		try {
			//1. Load the Driver
			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
			System.out.println("Trying to connect....");
			Connection conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected : "+ conn);
			
			//3. make a desired statement (insert/update/delete/select)
			
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
			
			pst.setInt(1, 40);
			pst.setString(3, "TESTING");
			pst.setString(2,"PUNE");
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			
			//6. close the statement, and connection
			
			pst.close();
			conn.close();
			System.out.println("Disconnected from the database....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
