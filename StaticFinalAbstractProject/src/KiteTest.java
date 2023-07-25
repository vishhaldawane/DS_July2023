
public class KiteTest {
	public static void main(String[] args) {
	
		Kite.showKiteCount();
		
		Kite kite1 = new Kite("Salil","Green",50,true);
	//	kite1.showKite();
		
		Kite kite2 = new Kite("Sujal","Blue",60,true);
	//	kite2.showKite();
		
		
		Kite kite3 = new Kite("Roshan","Red",70,true);
	//	kite3.showKite();

		
	//	Kite.showKiteCount();
		
		Kite kite4 = new Kite("Shruti","Pink",80,true);
	//	kite4.showKite();

		Kite kite5 = new Kite("Mitali","Yellow",90,true);
	//	kite5.showKite();

		
	//	Kite.showKiteCount();
		
		Kite.showKiteCount();

		kite1.kiteFight(kite3); //who is the invoker, kite4
		
		Kite.showKiteCount();
	}
}

class Kite {
	private String owner;
	private String color;
	private int length;
	private boolean flying;//true or false
	
	private static int kiteCount; //shared data across all Kite's objects

	public static void showKiteCount() { //static can only refer static
		System.out.println("Total kites in the sky : "+kiteCount);
		//length=100;
	}//Cannot make a static reference to the non-static field length
	
	public Kite(String owner, String color, int length, boolean flying) {
		super();
		System.out.println("Kite is created...");
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
		kiteCount++;
	}
	
	void showKite() { //non-static can refer static
		System.out.println("Kite Owner  : "+owner);
		System.out.println("Kite Color  : "+color);
		System.out.println("Kite Length : "+length);
		System.out.println("Kite count  : "+Kite.kiteCount);
		System.out.println("-------------------");
		
	}
	
	void kiteFight(Kite ref) { //kite4.kiteFight(kite5);
		System.out.println(color+" Kite initiated a fight with "+ref.color+" kite");
		
		for(int i=1;i<=20;i++ ) {
			double value = Math.random()%10;
			System.out.println(i+" Kites are fighting...."+value);
			
			if(value > 0.95) {
				kiteCount--; //assume that one kite is lost
				this.flying=false;
				System.out.println(owner+" lost the kite");
				break;
			}
			
			if(value< 0.010) {
				kiteCount--;
				ref.flying=false;
				System.out.println(ref.owner+" lost the kite");

				break;
			}
			
			if(value >=0.30 && value<=0.33) {
				kiteCount--;
				kiteCount--;
				this.flying=false;
				ref.flying=false;
				System.out.println("Both "+owner+" and "+ref.owner+" lost the kites");

				break;
			}
		}
	
	}
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}
	
	
	
}