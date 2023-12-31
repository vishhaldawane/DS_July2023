
public class BookTest {
	public static void main(String[] args) {
		
		Book bookObj1 = new Book(101, "JPL", "James Gosling", 890, 1200, 1);
		
		Book bookObj2 = new Book(102, "Unix", "Richard Stallman", 890, 1200, 4);
			
		Book bookObj3 = new Book(103, "C++ Primer Plus", "Stanley Lippman", 1290, 1500, 3);
		
		
		bookObj1.printBook();
		bookObj2.printBook();
		bookObj3.printBook();
			
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
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.edition = edition;
	}

	public void printBook()  { //accessor
		System.out.println("Number  : "+bookNumber);
		System.out.println("Name    : "+bookName);
		System.out.println("Author  : "+author);
		System.out.println("Price   : "+price);
		System.out.println("NOP     : "+numberOfPages);
		System.out.println("Edition : "+edition+"\n");
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






