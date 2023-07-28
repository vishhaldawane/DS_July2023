import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileDeSerializationTest {
	public static void main(String[] args) {
		
		BankAccount bankAccObj1 = null;
		
		
		try {
			FileInputStream fin = new FileInputStream("bank.dat");
			System.out.println("File is ready...");
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object input stream is ready...to read objects...");
			
			System.out.println("Trying to read the object from the file...");
			bankAccObj1 = (BankAccount) ois.readObject();
			System.out.println("Object is de-serialized.....");
			bankAccObj1.bankAccountDetails();
			
			
			ois.close();
			fin.close();
			System.out.println("Streams are closed....");
			
					
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
