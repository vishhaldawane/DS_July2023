import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactTest {
	public static void main(String[] args) {
		
		//CONTENT - WATER
		System.out.println("Creating content...");
		Contact contact1 = new Contact("Vishhal","9820443464","vishalvinning@mail.com");
		Contact contact2 = new Contact("Devendra","8820443464","devendra@mail.com");
		Contact contact3 = new Contact("Shruti","7820443464","shruti@mail.com");
		Contact contact4 = new Contact("Ratan","6820443464","ratan@mail.com");
		Contact contact5 = new Contact("Sujal","4820443464","sujal@mail.com");
		
		System.out.println("Content created ...");

		
		//CONTAINER - BOTTLE
		LinkedList contactList = new LinkedList();
		System.out.println("Container is ready...");
		
		//ADDDING WATER IN THE BOTTLE - adding content in the container
		System.out.println("Adding content to the container....");
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
		contactList.add(contact4);
		contactList.add(contact5);
		System.out.println("Entire content is added to the container....");

		//NOW RETRIEVE THE STRAW FOR THE BOTTLE - retrieving iterator for the container
		Iterator contactIterator = contactList.iterator();
		System.out.println("Got the Iterator...now iterating the content....");
		while(contactIterator.hasNext()) {
			Contact x = (Contact) contactIterator.next(); //cast it to Log, as it was added as an Object
			System.out.println("Contact : "+x);
		}
		
	}
}

class Contact
{
	private String contactName;
	private String mobileNumber;
	private String emailAddress;
	
	public Contact(String contactName, String mobileNumber, String emailAddress) {
		super();
		this.contactName = contactName;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", mobileNumber=" + mobileNumber + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
}





