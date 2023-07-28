import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest {
	public static void main(String[] args) {
		
		System.out.println("Trying to write to a file....");
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("queen.txt", true); //true means append to the file

			System.out.println("File is ready to write...");

			String str="We should bunk the class and goto the team outing!!!";
			
			byte array[] = str.getBytes(); //converts the string into a byte array
			fileOutputStream.write(array);
			System.out.println("String is written to the file");

			fileOutputStream.close();
			System.out.println("File is closed now...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		
	}
}
