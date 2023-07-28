import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class FileDeSerializationArrayList {
	public static void main(String[] args) {
		
	
		try {
			FileInputStream fin = new FileInputStream("banking.txt");
			System.out.println("File is ready...");
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object input stream is ready....");
			
			System.out.println("Trying to read the object ...");
		
			ArrayList accList = 	(ArrayList) ois.readObject();
				
				Iterator accIterator = accList.iterator();
				
				while(accIterator.hasNext()) {
					BankAccount bankAcc = (BankAccount) accIterator.next();
					
					bankAcc.bankAccountDetails();
					
				}
			
			
			System.out.println("Objects ARE de-serialized.....");
			
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
