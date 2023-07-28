import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) {
		
		System.out.println("Trying to read a file....");
		
		try {
//			FileInputStream fileInputStream = new FileInputStream("king.txt");

			FileInputStream fileInputStream = new FileInputStream("/Users/apple/prince.txt");
			System.out.println("File is open...");

			byte theChar=(byte)fileInputStream.read(); // read the first letter
			
			while(theChar != -1 ) { //-1 is EOF 
				System.out.print((char)theChar);
				theChar=(byte)fileInputStream.read(); //read successive letter
				Thread.sleep(100);
			}
			fileInputStream.close();
			System.out.println("File is closed now...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
