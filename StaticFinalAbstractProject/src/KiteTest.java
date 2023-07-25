
public class KiteTest {
	public static void main(String[] args) {
	
		Kite.showKiteCount();
		
		Kite kite1 = new Kite("Salil","Green",50);
		kite1.showKite();
		
		Kite kite2 = new Kite("Sujal","Blue",60);
		kite2.showKite();
		
		
		Kite kite3 = new Kite("Roshan","Red",70);
		kite3.showKite();

		
		Kite.showKiteCount();
		
		Kite kite4 = new Kite("Shruti","Pink",80);
		kite4.showKite();

		Kite kite5 = new Kite("Mitali","Yellow",90);
		kite5.showKite();

		
		Kite.showKiteCount();
		
		
	}
}

class Kite {
	private String owner;
	private String color;
	private int length;
	
	private static int kiteCount; //shared data across all Kite's objects

	public static void showKiteCount() { //static can only refer static
		System.out.println("Total kites in the sky : "+kiteCount);
		//length=100;
	}//Cannot make a static reference to the non-static field length
	
	public Kite(String owner, String color, int length) {
		super();
		System.out.println("Kite is created...");
		this.owner = owner;
		this.color = color;
		this.length = length;
		kiteCount++;
	}
	
	void showKite() { //non-static can refer static
		System.out.println("Kite Owner  : "+owner);
		System.out.println("Kite Color  : "+color);
		System.out.println("Kite Length : "+length);
		System.out.println("Kite count  : "+Kite.kiteCount);
		System.out.println("-------------------");
		
	}

	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}
	
	
	
}