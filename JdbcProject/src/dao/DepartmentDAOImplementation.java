package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImplementation implements DepartmentDAO {

	Connection conn ; //GLOBAL 
	
	public DepartmentDAOImplementation() {
		try {
			//1. Load the Driver
			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
			System.out.println("Trying to connect....");
			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected : "+ conn);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void insertDepartment(Department dept) {
		//3. make a desired statement (insert/update/delete/select)
		
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
			
			pst.setInt(1, dept.getDepartmentNumber());
			pst.setString(3, dept.getDepartmentName());
			pst.setString(2,dept.getDepartmentLocation());
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public Department selectDepartment(int deptNumber) {
		
		Department deptObj =null;
		try {
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM DEPT10 WHERE DEPTNO="+deptNumber);
			
			//5. process teh result if any
			if(result.next()) {
				deptObj = new Department(); //blank object
				
				deptObj.setDepartmentNumber(result.getInt(1));
				deptObj.setDepartmentLocation(result.getString(2));
				deptObj.setDepartmentName(result.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptObj;
	}

	@Override
	public List<Department> selectDepartments() {
		
		List<Department> deptList = new ArrayList<Department>();
		try {
			
			 
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM DEPT10");
			
			//5. process teh result if any
			while(result.next()) {
				Department deptObj = new Department(); //blank object
				
				deptObj.setDepartmentNumber(result.getInt(1));
				deptObj.setDepartmentLocation(result.getString(2));
				deptObj.setDepartmentName(result.getString(3));
				deptList.add(deptObj); // add this object to the LIST 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptList;
	}

	@Override
	public void updateDepartment(Department dept) {
		//3. make a desired statement (insert/update/delete/select)
		
				try {
					PreparedStatement pst = 
							conn.prepareStatement("UPDATE DEPT10 set dname=?, loc=? where deptno=?");
					
					
					pst.setString(1, dept.getDepartmentName()); //SET dname=?
					pst.setString(2,dept.getDepartmentLocation()); //SET loc=?
					pst.setInt(3, dept.getDepartmentNumber()); //WHERE deptno=?

					
					System.out.println("PreparedStatement is created : "+ pst);
					
					//4. execute that statement //  UR TABLENAME IS MYDEPT120
					int rows = pst.executeUpdate();
					
					System.out.println("Row MODIFIED : "+rows);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@Override
	public void deleteDepartment(int deptNumber) {
		//3. make a desired statement (insert/update/delete/select)
		
		try {
			PreparedStatement pst = 
					conn.prepareStatement("DELETE FROM DEPT10 where deptno=?");
			
			pst.setInt(1, deptNumber); //WHERE deptno=?

			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Row DELETED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
