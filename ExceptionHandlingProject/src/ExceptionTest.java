
public class ExceptionTest {
	public static void main(String[] args) {
		
		
		String str="Dassault System Private Limited";
		
		int array[]= {10,20,30,40,50};
		
		String name="JACK";
		
		int num=100;
		int deno=0;
		
		try {
			System.out.println("Begin ");
			System.out.println("str  : "+str.toLowerCase());
			System.out.println("str  : "+str.charAt(9));
			System.out.println("ary  : "+array[3]);
			System.out.println("name : "+name.toLowerCase());
			System.out.println("div  : "+(num/deno));
		}
		
		catch(NullPointerException ex1) {
			System.out.println("some problem1 : "+ex1); //ExceptionName + msg
		}
		catch(ArrayIndexOutOfBoundsException ex2) {
			System.out.println("some problem2 : "+ex2);
		}
		catch(StringIndexOutOfBoundsException ex3) {
			System.out.println("some problem3 : "+ex3);
		}
		catch(ArithmeticException ex4) {
			System.out.println("some problem4 : "+ex4);
		}
		catch(RuntimeException ex5) {
			System.out.println("some problem5 : "+ex5);
		}
		catch(Exception ex6) {
			System.out.println("some problem6 : "+ex6);
		}
		
		System.out.println("end ");
		
	}
}
