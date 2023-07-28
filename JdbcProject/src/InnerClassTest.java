
public class InnerClassTest {
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		Bird bird = new Bird();
		bird.activity(tree);
		
		//Nest nest = new Nest();
		//nest.layEggs();
		
		BankAccount ba = new BankAccount();
		if(ba.perm.canWithdraw()) {
			System.out.println("can withdraw");
		}
		else {
			System.out.println("cannot withdraw");
		}
		
		
	}
}

class School
{
	
	class Admission { 
		
	}
	
}

class BankAccount { //A
	float accoutBalance;
	Permission perm = new Permission();
	
	 class Permission { //B
		private boolean withdraw;
		private boolean deposit;
		private boolean transfer;
		
		public boolean canWithdraw() {
			return withdraw;
		}
		
	}
	
}

class Tree
{	
	Nest nest = new Nest(); //hasA
		
	class Nest { //inner class - named 
		
		void layEggs() {
			System.out.println("Laying eggs....in the nest....");
		}	
	}
}

class Bird
{
	void fly() {
		System.out.println("Bird is flying ");
	}
	void activity(Tree tree) {
		tree.nest.layEggs();
	}
}
