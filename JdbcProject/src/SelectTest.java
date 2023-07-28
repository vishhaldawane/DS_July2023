import java.sql.Connection;
import java.sql.DriverManager; // all methods throws SQLException
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
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
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM DEPT10");
			
			//5. process teh result if any
			while(result.next()) {
				System.out.println("DEPTNO : "+result.getInt(1));
				System.out.println("DNAME  : "+result.getString(2));
				System.out.println("LOC    : "+result.getString(3));
				System.out.println("-------------");
			}
			//6. close the statement, and connection
			result.close();
			statement.close();
			conn.close();
			System.out.println("Disconnected from the database....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
