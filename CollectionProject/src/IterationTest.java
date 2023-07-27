import java.util.Scanner;

public class IterationTest {
	public static void main(String[] args) {
	
	/*	Singing singing = new Singer();
		
		Reward reward   = singing.singASong("cheque");
		
		reward.utilize();*/
		
		Demo demoRef = new Demo();
		demoRef.demo();

	}
}

class SingingIndustry {
	static Singer getASinger() {
		return new Singer();
	}
}
interface Singing {
	Reward  singASong();
	Reward  singASong(String hint);
}
class Singer implements Singing { //isA
	
	public Reward  singASong() {
		Cheque cheque = new Cheque();
		return cheque;
	}

	public Reward  singASong(String hint) {
		Reward reward = null;
		
		if(hint.equalsIgnoreCase("holidays")) {
			reward = new HolidayPackage();
		}
		else if(hint.equalsIgnoreCase("cheque")) {
			reward = new Cheque();
		}
		else if(hint.equalsIgnoreCase("cash")) {
			reward = new Cash();
		}
		return reward;
	}

}

interface Reward {
	void utilize();
}
class Cheque implements Reward {
	public void utilize() {
		System.out.println("Dropping the cheque in the bank...");
	}
}
class Cash implements Reward {
	public void utilize() {
		System.out.println("Putting the cash in the wallet...");
	}
}
class HolidayPackage implements Reward {
	public void utilize() {
		System.out.println("Enjyoing the holiday package....");
	}
}




class Demo
{
	void demo() {
		
		/*Magician magician = new CardMagician();
		Magic cardMagic = magician.doTrick();
		cardMagic.show();*/
		
		System.out.println("Which magician type you want ? ");
		Scanner scanner = new Scanner(System.in);
		
		String theHint = scanner.next();
		
		Magician magician = EventAgency.getMagician(theHint);
		Magic magic = magician.doTrick();
		magic.show();
		
	}
}

class EventAgency {
	public static Magician getMagician(String hint) {
		Magician magician = null;
		if(hint.equalsIgnoreCase("hats")) {
			magician = new HatMagician();
		}
		else if(hint.equalsIgnoreCase("cards")) {
			magician = new CardMagician();
		} 
		return magician;
	}
}


interface Magician
{
	Magic doTrick();	
}

class CardMagician implements Magician
{
	public Magic doTrick() {
		System.out.println("Hiding some cards under the sleeves....");
		Magic magic = new CardMagic();
		return magic;
	}
}

class HatMagician implements Magician
{
	public Magic doTrick() {
		System.out.println("Hiding the parrot under the Hat....");
		Magic magic = new HatMagic();
		return magic;
	}
}


interface Magic
{
	void show();
}
class CardMagic implements Magic
{
	public void show() {
		System.out.println("Showing cards...in a magical way....");
	}
}

class HatMagic implements Magic
{
	public void show() {
		System.out.println("Showing hats  and parrot...in a magical way....");
	}
}


















