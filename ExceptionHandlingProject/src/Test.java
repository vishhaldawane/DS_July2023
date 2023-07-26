
public class Test {
	public static void main(String[] args) {
		
		System.out.println("BEGIN MAIN");
		
		try {
			System.out.println("line 1");
			System.out.println("line 2");
			
			if(50>65)
				   throw new RuntimeException("Some problem 1...");
				
			System.out.println("line 3");
			System.out.println("line 4");
			if(50>57)
			   throw new RuntimeException("Some problem 2...");
			
			System.out.println("line 5");
			System.out.println("line 6");
			System.out.println("line 7");
			
			if(50>56)
				   throw new RuntimeException("Some problem 3...");
				
			System.out.println("line 8");
			System.out.println("line 9");
			System.out.println("line 10");
		}
		catch(RuntimeException ex) {
			System.out.println("Exception caught : "+ex);
		}
		
		System.out.println("END MAIN");
		
	}
}
