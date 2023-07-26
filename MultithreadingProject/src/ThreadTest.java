
public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("1. BEGIN MAIN : "+Thread.currentThread().getName());
		
		System.out.println("2. CREATING THREADS....");
		Car car1 = new Car("Swift",1000);
		Car car2 = new Car("\tSkoda",1000);
		Car car3 = new Car("\t\tKIA Carnival",1000);
		Bus bus1 = new Bus("\t\t\tShivneri",10);
		Bus bus2 = new Bus("\t\t\t\tPMT",20);
		

		System.out.println("is car1 alive? "+car1.isAlive());
		System.out.println("is car2 alive? "+car2.isAlive());
		System.out.println("is car3 alive? "+car3.isAlive());
		System.out.println("is bus1 alive? "+bus1.isAlive());
		System.out.println("is bus2 alive? "+bus2.isAlive());
		
		
		System.out.println("8. STARTING THREADS....");

		
		car1.start();
		car2.start();
		car3.start();
		bus1.start();
		bus2.start();
		
		System.out.println("STARTED : is car1 alive? "+car1.isAlive());
		System.out.println("STARTED : is car2 alive? "+car2.isAlive());
		System.out.println("STARTED : is car3 alive? "+car3.isAlive());
		System.out.println("STARTED : is bus1 alive? "+bus1.isAlive());
		System.out.println("STARTED : is bus2 alive? "+bus2.isAlive());
	
		
		System.out.println("14. THREADS STARTED....");
		
		
		try {
			car1.join();
			car2.join();
			car3.join();
			bus1.join();
			bus2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("OVER : is car1 alive? "+car1.isAlive());
		System.out.println("OVER : is car2 alive? "+car2.isAlive());
		System.out.println("OVER : is car3 alive? "+car3.isAlive());
		System.out.println("OVER : is bus1 alive? "+bus1.isAlive());
		System.out.println("OVER : is bus2 alive? "+bus2.isAlive());
	
		
		System.out.println("15. END OF MAIN");
		
	}
}

class Car extends Thread //1
{
	String model;
	int delay;

	public Car(String model, int delay) {
		super();
		this.model = model;
		this.delay = delay;
	}
	public void run() { //2 
		for(int i=1;i<=10;i++) {
			System.out.println(model+" is running..."+i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Bus extends Thread //1
{
	String model;
	int delay;

	public Bus(String model, int delay) {
		super();
		this.model = model;
		this.delay = delay;
	}
	public void run() { //2 
		for(int i=1;i<=30;i++) {
			System.out.println(model+" is running..."+i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
