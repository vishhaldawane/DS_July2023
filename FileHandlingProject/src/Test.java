// The Java Programming Language - James Gosling

public class Test {
	public static void main(String[] args) {
		
		Flying flying = new Butterfly();
		flying.fly();
		
		Dreaming dream = new Butterfly();
		dream.fly();
	}
}
class Flying { //Salil : aerodynamics fly
	public void flyAero() { }
}
interface Dreaming { //Mayuresh : fly of Dream
	void flyDreaming();
}

class Butterfly extends Flying implements Dreaming
{

	//whose contract is fulfilled???? Salil's or Mayuresh's contract?

	
}