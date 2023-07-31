package dao; //1. package

//POJO as per the DEPT10 table's structure

//2. public 
public class Department { //I. POJO
	//4. it must have private data as per the table's structure
	private int departmentNumber; //deptno
	private String departmentName; //dname
	private String departmentLocation; //loc
	
	//3. ctor
	public Department() {
		System.out.println("Department() ctor...");
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	//5.
	
	
}
