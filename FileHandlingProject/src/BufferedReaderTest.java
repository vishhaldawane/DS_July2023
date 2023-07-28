import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class BufferedReaderTest {
	public static void main(String[] args) {
		
		System.out.println("Trying to read a file....");
		
		try {

			FileInputStream fileInputStream1 = new FileInputStream("/Users/apple/prince3.txt");
			
			FileInputStream fileInputStream2 = new FileInputStream("/Users/apple/prince3.txt");
			BufferedInputStream buffStream   = new BufferedInputStream(fileInputStream2);
			
			
			System.out.println("File is open...");

			byte theChar=(byte) fileInputStream1.read(); // read the first letter
			
			Calendar now = Calendar.getInstance();
			while(theChar != -1 ) { //-1 is EOF 
				//System.out.print((char)theChar);
				theChar=(byte)fileInputStream1.read(); //read successive letter
			}
			Calendar then =  Calendar.getInstance();
			
			System.out.println("Time without buffering : "+(then.getTimeInMillis() - now.getTimeInMillis()));
			fileInputStream1.close();
			System.out.println("File is closed now...");
			
			System.out.println("=========");
			
			System.out.println("File is open...");

			theChar=(byte) buffStream.read(); // read the first letter
			
			now = Calendar.getInstance();
			while(theChar != -1 ) { //-1 is EOF 
				//System.out.print((char)theChar);
				theChar=(byte)buffStream.read(); //read successive letter
			}
			then =  Calendar.getInstance();
			
			System.out.println("Time with    buffering : "+(then.getTimeInMillis() - now.getTimeInMillis()));
			buffStream.close();
			fileInputStream2.close();
			
			System.out.println("File2 is closed now...");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
