
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Book
{
	int  bookNumber;
	String bookName;
	float bookPrice;

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookNumber;
		result = prime * result + Float.floatToIntBits(bookPrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		
		if (bookNumber != other.bookNumber)
			return false;
		
		
		if (Float.floatToIntBits(bookPrice) != Float.floatToIntBits(other.bookPrice))
			return false;
		
		return true;
	}

	public Book(int bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}

	public Book(int bookNumber, String bookName, float bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}	
}


public class HashSetTest {
	public static void main(String[] args) {
		Book b1 = new Book(101,"Java8",1200.0f);
		Book b2 = new Book(101,"Java11",1200.0f);
		Book b3 = new Book(101,"Java15",1200.0f);
		Book b4 = new Book(102,"Java15",1200.0f);
		Book b5 = new Book(101,"Java15",1300.0f);

		
		
		

		
		System.out.println("Books are ready....");
		
		HashSet myBookShelf = new HashSet();
		System.out.println("Book shelf is ready....");
		
		System.out.println("Adding books to the bookShelf....");
		myBookShelf.add(b1);
		myBookShelf.add(b2);
		myBookShelf.add(b3);
		myBookShelf.add(b4);
		myBookShelf.add(b5);
		
		
		

		System.out.println("Books are added to the Shelf..");
		
		Iterator bookIterator = myBookShelf.iterator();

		while(bookIterator.hasNext()) {
			Book theBook = (Book) bookIterator.next();
			System.out.println("The Book : "+theBook);		
		}
		
	}
}