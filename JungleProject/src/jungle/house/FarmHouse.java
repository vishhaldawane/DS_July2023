package jungle.house; // belong to 

import jungle.cave.Tiger; //avail it here

public class FarmHouse {
	public static void main(String[] args) {
		
		
		Tiger tiger = new Tiger();
		//tiger.roar(); //default there, hence not available here
		tiger.walk(); // public
			
		//tiger.hunt(); //protected : The method hunt() from the type Tiger is not visible
		//tiger.sleep();//private : 
		
	}
}
