
public class SampleTest {
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("White","Jane");
		Cat cat2 = new Cat("Black","Julie");
		Cat cat3 = new Cat("Brown","Janet");

		cat1.drinkMilk();
		cat2.drinkMilk();
		cat3.drinkMilk(); // cat1.Cat::drinkMilk(); -> Cat::drinkMilk(cat1);
	
		cat1.playWithHerSelf();
		
		cat1.catFight(cat2); //passing object as an argument
		
	}
}

class Cat
{
	String color;
	String name;
	public Cat(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	
	void catFight(Cat x) { //x is proxy for the object that is passed
		
		System.out.println(this.color+ " cat started fight with "+x.color+" cat");
		
	}
	void drinkMilk() {
		System.out.println(this.color+" cat is drinking milk...");
	}
	
	void playWithHerSelf() {
		System.out.println(this.name+" playing with herself....");
	}
	
}
