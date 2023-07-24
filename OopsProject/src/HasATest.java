
public class HasATest {
	public static void main(String[] args) {
		Human theHuman = new Human();
		theHuman.breathing();
		theHuman.thinking();
		theHuman.drinkLemonJuice();
		theHuman.doPranayama();	
	}
}
class Heart{
	void pumping() {
		System.out.println("Heart is pumping...");
	}
}
class Brain{
	void analyzing() {
		System.out.println("Brain is analyzing....");
	}
}
class Kidney {
	void filterBlood() {
		System.out.println("Filtering the blood....");
	}
}
class Lung {
	void oxegenateBlood() {
		System.out.println("Oxegenating blood......");
	}
}
class Mammal {
	
}
class Human extends Mammal { //isA 
	
	private Heart myHeart = new Heart(); //hasA
	private Brain brain = new Brain(); //hasA
	private Kidney rightKidney = new Kidney();
	private Kidney leftKidney = new Kidney();
	private Lung rightLung = new Lung();
	private Lung leftLung = new Lung();
	
	
	void breathing() {
		System.out.println("Human is breathing....");
		myHeart.pumping();
	}
	void thinking() {
		System.out.println("Human is thinking....");
		brain.analyzing();
	}
	void drinkLemonJuice() {
		System.out.println("Drinking lemon juice...");
		rightKidney.filterBlood();
		leftKidney.filterBlood();
	}
	void doPranayama() {
		System.out.println("Doing Pranayama....");
		rightLung.oxegenateBlood();
		leftLung.oxegenateBlood();
	}
}
