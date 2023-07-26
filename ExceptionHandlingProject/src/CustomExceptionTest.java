
public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}

class Car
{
	boolean keyFound=false;
	
	Car() throws CarKeyNotFoundException
	{
		double value = Math.random()%10;
		
		if(value>=0.80) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
		}
	}
}
