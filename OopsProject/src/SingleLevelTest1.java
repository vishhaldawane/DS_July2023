
public class SingleLevelTest1 {
	public static void main(String[] args) {
		/*Person personObj = new Person(24);
		personObj.showPerson();
		System.out.println("-----------------");
		*/
		
		Student studentObj = new Student('M',"Jack",24,   123,"BharatiVidyapeeth","MechEng",899);
		studentObj.showStudent();
		/*
		System.out.println("-----------------");
		Employee empObj = new Employee();
	*/
	}
}


class Person {
	private char gender;
	private String name;
	private int age;
	
	Person() {
		System.out.println("Person() ctor....");
	}
	
	Person(int age) {
		this('F',"NONAME",age); //invoking ctor of the same class - reuse
		/*System.out.println("START=> Person(int)");
			this.age = age;
		System.out.println("FINISH=> Person(int)");*/
		
	}
	Person(char gender, String name, int age) {
		System.out.println("START=> Person(char,String,int) ctor....");		
		
		if(gender=='M' || gender=='F') {
			this.gender = gender;
		}
		else {
			//System.out.println("Invalid Gender...");
			//throw new RuntimeException("Invalid gender.....");
			RuntimeException runtimeGenderEx = new RuntimeException("Invalid gender : "+gender);
			throw runtimeGenderEx;
		}
		
		if(Validator.checkString(name)) {
			this.name = name;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid name : "+name);
			throw runtimeNameEx;
		}
		
		if(age >=1 && age <=120) {
			this.age = age;
		}
		else {
			RuntimeException runtimeAgeEx = new RuntimeException("Invalid age : "+age);
			throw runtimeAgeEx;	
		}
		System.out.println("FINISH=> Person(char,String,int) ctor....");		

	}
	void showPerson() {
		System.out.println("---- PERSONAL ----");
		System.out.println("GENDER : "+gender);
		System.out.println("NAME   : "+name);
		System.out.println("AGE    : "+age);
	}
 }
class Student extends Person {
	private int rollNumber;
	private String collegeName;
	private String stream;
	private float totalMarks;
		
	Student(char gender, String name, int age, int rollNumber,String collegeName, String stream, float totalMarks) {
		super(gender,name,age); //REUSE THE ctor OF THE PARENT
		System.out.println("Student() ctor...");
		
		if(Validator.checkNumber(rollNumber, 1, 500)) {
			this.rollNumber = rollNumber;			
		}
		else {
			RuntimeException runtimeRollNumberEx = new RuntimeException("Invalid Roll Number : "+rollNumber);
			throw runtimeRollNumberEx;
		}
		
		if(Validator.checkString(collegeName)) {
			this.collegeName = collegeName;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid collegeName : "+collegeName);
			throw runtimeNameEx;
		}
		
		if(Validator.checkString(stream)) {
			this.stream = stream;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid stream : "+stream);
			throw runtimeNameEx;
		}
		

		if(Validator.checkNumber(totalMarks, 1, 1000)) {
			this.totalMarks = totalMarks;			
		}
		else {
			RuntimeException runtimeMarksEx = new RuntimeException("Invalid Marks : "+totalMarks);
			throw runtimeMarksEx;
		}
		

		this.totalMarks = totalMarks;
	}
	
	void showStudent() {
		super.showPerson(); //super. to invoke super class member/data/function
		System.out.println("---- STUDENT ----");
		System.out.println("ROLLNO : "+rollNumber);
		System.out.println("COLLGE : "+collegeName);
		System.out.println("STREAM : "+stream);
		System.out.println("MARKS  : "+totalMarks);
	}
}
class Employee extends Student {
	private int empno;
	private String companyName;
	private String designation;
	float salary;
	
	
	Employee() {
		super();
		System.out.println("Employee() ctor...");
	}
}