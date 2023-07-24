
public class DataTypeTest {
	public static void main(String[] args) {
		
		//-128 ...0.. to 127 
		
		//Byte roll = new Byte(128);
		
		
		byte rollNumber=-128;
		//rollNumber.plusplus();
		
		short  universityId=32767;
		int   policyNumber=40000;
		long adhaarCard=123412341234L;//suffix L to make it as long type
		
		//Type mismatch: cannot convert from int to byte
		//any open number in java is default as integer
		
		//any open decimal value is of type double
		
		
		//Type mismatch: cannot convert from double to float
		float interestRate = 3.5f; //F or f
		
		//System.out.println("rollNumber      : "+rollNumber);
		System.out.println("size of byte    : "+Byte.SIZE+" bits");
		System.out.println("size of short   : "+Short.SIZE+" bits");

		System.out.println("size of int     : "+Integer.SIZE+" bits");

		System.out.println("size of long    : "+Long.SIZE+" bits");

		System.out.println("size of float   : "+Float.SIZE+" bits");

		System.out.println("size of double  : "+Double.SIZE+" bits");

		System.out.println("size of char    : "+Character.SIZE+" bits");
	//	System.out.println("size of bool    : "+Boolean.SIZE+" bits");

		
	}
}
