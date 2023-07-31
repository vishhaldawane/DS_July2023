package dao;

import java.util.List;

public class TestDepartment {
	public static void main(String[] args) {
		
		
		DepartmentDAO deptDAO = new DepartmentDAOImplementation();
		
		
/*		Department deptObj = deptDAO.selectDepartment(40);
		System.out.println();
		System.out.println("DEPTNO : "+deptObj.getDepartmentNumber());
		System.out.println("DNAME  : "+deptObj.getDepartmentName());
		System.out.println("LOC    : "+deptObj.getDepartmentLocation());
		System.out.println("-------------");
*/
		
		List<Department> deptList = deptDAO.selectDepartments();
		for (Department deptObj : deptList) {
			System.out.println("DEPTNO : "+deptObj.getDepartmentNumber());
			System.out.println("DNAME  : "+deptObj.getDepartmentName());
			System.out.println("LOC    : "+deptObj.getDepartmentLocation());
			System.out.println("-------------");
		}	
		
	}
}
