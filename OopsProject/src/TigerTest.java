
public class TigerTest {
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.jump();
		tiger.jump(10);
		tiger.jump(12, 6);
		tiger.jump(9.5f);
		tiger.jump(12, 6.9f);
		tiger.jump(4.5f, 7);
		//javac -d . City.java    -d means generate all the packages 
		//. means in the current folder generate them 
		
		//javac -d c:\windows  City.java
	}
}

class Tiger
{
	void jump() {
		System.out.println("Tiger: jump():  is jumping...");
	}
	void jump(int length) {
		System.out.println("Tiger: jump(int) is jumping..."+length+" feet length");
	}
	void jump(int length,int height) {
		System.out.println("Tiger: jump(int,int) is jumping..."+length+" feet length and  "+height+" feet long height");
	}
	void jump(float length) {
		System.out.println("Tiger: jump(float) is jumping..."+length+" feet length");
	}
	
	void jump(int length,float height) {
		System.out.println("Tiger: jump(int,float) is jumping..."+length+" feet length and  "+height+" feet long height");
	}
	void jump(float length,int height) {
		System.out.println("Tiger: jump(float,int) is jumping..."+length+" feet length and  "+height+" feet long height");
	}
	
	
}
