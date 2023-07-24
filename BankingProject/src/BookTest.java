
public class BookTest {
	public static void main(String[] args) {
		
		Book bookObj1 = new Book(101, "JPL", "James Gosling", 890, 1200, 1);
		Book bookObj2 = new Book(102, "Unix", "Richard Stallman", 700, 1200, 4);	
		Book bookObj3 = new Book(103,"C++","Stanley Lippman", 1290, 1500, 3);
		
		
		bookObj1.printBook();
		bookObj2.printBook();
		bookObj3.printBook();
		
		bookObj1.changeBookEdition(2);
		
		bookObj1.printBook();
			
		float totalCost = bookObj3.buyBooks(4); 
		System.out.println("Total Cost : "+totalCost);
		
		System.out.println("Whats the price of book1 : "+bookObj1.getPrice());
		System.out.println("Whats the price of book2 : "+bookObj2.getPrice());
		System.out.println("Whats the price of book3 : "+bookObj3.getPrice());
	}
	
}


class Book
{
	private int bookNumber; //data member | field [java]
	private String bookName ;
	private String author;
	private float price;
	private int numberOfPages;
	private int edition;
	
	

/*	Book() {
		System.out.println("Book() ctor...called.....");
	}
*/
	
	//mutator function|member function | method [java]
	/*public void set*/
	
	Book(int bookNumber, String bookName, String author, float price, int numberOfPages, int edition) {
		System.out.println("Book(int,String,String,float,int,int)  ctor");
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.edition = edition;
	}

	Book(String bookName, String author, float price, int numberOfPages, int edition) {
		System.out.println("Book(String,String,float,int,int)  ctor");
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.edition = edition;
	}
	
	Book(String author, float price, int numberOfPages, int edition) {
		System.out.println("Book(String,float,int,int)  ctor");
		this.author = author;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.edition = edition;
	}
	void printBook()  { //1st type | no arg | no return
		System.out.println("Number  : "+bookNumber);
		System.out.println("Name    : "+bookName);
		System.out.println("Author  : "+author);
		System.out.println("Price   : "+price);
		System.out.println("NOP     : "+numberOfPages);
		System.out.println("Edition : "+edition+"\n");
	}
	void changeBookEdition(int newEdition) { //2nd type | with arg | no return
		System.out.println("Changing edition of the book....");
		edition = newEdition;
	}
	
	float buyBooks(int quantity) { // 3rd type | with arg | with return
		System.out.println("Buying..."+quantity+" books titled as "+bookName+" by "+author);
		return price * quantity;
	}
	
	float getPrice() { //4th type | without arg | with return
		 System.out.println("returning price of the book.....");
		 return price;
	}
	
}


/*
 * Shobhit Samuel Singh
 * Ankush CS 
 * Pavan S
 * Sujal Amborkar 
 * 
 */


//struct Book (C) <-- only fields
//struct Book (C++) <-- fields+ method BUT public
//struct Book (C++) <-- private field + public methods 

//class  Book (C++) <-- default as private  | public:


/*

 
 
 	Book bookObj1 = new     Book();  
 	|	    |		 |		  |
 	Type  refTo	  allocator Constructor
 		  Book
 		  

			STACK					HEAP
			
										FIELD AREA
										
						bookNumber,  bookName,  author,  price,  numberOfPages,  edition
						------------------------------------------------------------------
						|0		|	null		|null	  |0.0		|	0	  |		0  |
						------------------------------------------------------------------
			+---------->100
			|				
			100								
			bookObj1				
										METHOD AREA
										
										Book() { } <--- default constructor
										setBook(......) <-- set method for all fields
										
										FIELD AREA
										
						bookNumber,  bookName,  author,  price,  numberOfPages,  edition
						------------------------------------------------------------------
						|		|			|		   |		|				|		  |
						------------------------------------------------------------------
			+---------->200
			|				
			200								
			bookObj2
			
						
											FIELD AREA
										
						bookNumber,  bookName,  author,  price,  numberOfPages,  edition
						------------------------------------------------------------------
						|		|			|		   |		|				|		  |
						------------------------------------------------------------------
			+---------->300
			|				
			300								
			bookObj3	
			
			
*/






