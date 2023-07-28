import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileSerializationTest {
	public static void main(String[] args) {
		
		BankAccount bankAccObj1 = new BankAccount();
		BankAccount bankAccObj2 = new BankAccount();
		BankAccount bankAccObj3 = new BankAccount();
		
		bankAccObj1.setAccountNumber(1234);
		bankAccObj1.setAccountHolder("Robert");
		bankAccObj1.setAccountBalance(500000);
		bankAccObj1.setAccountType("Savings");
		bankAccObj1.setIfscCode("SBI123456");
		bankAccObj1.setOperationType("Single");
		
		bankAccObj2.setAccountNumber(5544);
		bankAccObj2.setAccountHolder("Julia");
		bankAccObj2.setAccountBalance(600000);
		bankAccObj2.setAccountType("Current");
		bankAccObj2.setIfscCode("BOB123456");
		bankAccObj2.setOperationType("Joint");
		
		bankAccObj3.setAccountNumber(9988);
		bankAccObj3.setAccountHolder("Peter");
		bankAccObj3.setAccountBalance(700000);
		bankAccObj3.setAccountType("Fixed");
		bankAccObj3.setIfscCode("ANZ123456");
		bankAccObj3.setOperationType("Firm");
		
		try {
			FileOutputStream fout = new FileOutputStream("banking.txt");
			System.out.println("File is ready...");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object output stream is ready....");
			
			System.out.println("Trying to write the private data to the file...");
			ArrayList accountList = new ArrayList();
			
			accountList.add(bankAccObj1);
			accountList.add(bankAccObj2);
			accountList.add(bankAccObj3);
			
			
			oos.writeObject(accountList); //STORE THE ARRAY LIST 
			
			System.out.println("Objects ARE serialized.....");
			
			oos.close();
			fout.close();
			System.out.println("Streams are closed....");
			
					
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
