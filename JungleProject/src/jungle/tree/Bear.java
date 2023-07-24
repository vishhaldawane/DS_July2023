package jungle.tree;

import jungle.cave.Tiger;

public class Bear //NON-HCILD
{
	void huntHoney() {
		Tiger tiger = new Tiger();
		tiger.privateMethodA(); // NEVER-EVER
		tiger.protectedMethodB();//same cave, trust factor broken due to diff package
		tiger.defaultMethodD();//diff package 
		tiger.publicMethodC(); //EVERYWHERE
		
		WhiteTiger whiteTiger = new WhiteTiger();
		
		whiteTiger.playWith(tiger);
	}
}

