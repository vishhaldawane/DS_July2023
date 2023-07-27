//Demonstrate thread priorities

class Clicker  implements Runnable {

	long click = 0; //to increment
	
	Thread t; //handle for Thread class
	String threadName;
	
	private  volatile boolean  running = true; //check if it is running or not

		public Clicker(String name,int p)		{ //p is the priority value 1 , 5 or 10
			threadName=name;
			t = new Thread(this); //runnable object is passed, Clicker
			t.setPriority(p);//set the priority
		}

		public void run()		// the logic goes here
		{
			System.out.println("=> RUN STARTED...."+threadName);
			while(running) 	//infinite loop , since it is TRUE	
			{
				click++; // infinitely increment click
				System.out.println(threadName+" counting "+click);
			}
			System.out.println("=> RUN IS OVER..."+threadName);
		}

		public void stop()  {
			running=false; //STOP the loop, if it is FALSE
			System.out.println("stop: Stopping "+threadName);
		}

		public void startClicker() { //it is of Clicker, and not of Thread
			t.start(); // the actual start() of Thread, invokes your run()
		}
}

public class HiLoPri			{
	public static void main(String[] args) 	{

		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker("Hi",Thread.MAX_PRIORITY);//10
		Clicker lo = new Clicker("\tLow",Thread.MIN_PRIORITY);//1

		lo.startClicker();
		hi.startClicker();
		System.out.println("started......");

		try		{
			Thread.sleep(7000);
			//System.out.println("7 seconds over....");
		}
		catch (InterruptedException e) 		{
				System.out.println("Main thread interrupted");
		}
		
		System.out.println("trying to stop them...");
		lo.stop();
		hi.stop();
		System.out.println("stopped them...");

		/*try {
			lo.t.join();
			hi.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Low-priority thread :  "+lo.click);
		System.out.println("Hi-priority thread  :  "+hi.click);
		
		System.out.println("-- END OF MAIN --");
	}
}
// lo =  32678065
//hi = 1613291673
