package ex4.book;
/**
	The class <b>Book</b> which holds the book id, title and price.
*/
public class Book
{
	private int bookId;
	private String title;
	private double price;
	private static int nextBookId;
	private static int noOfInstanceCreated;
	
	/**
		This is a static block which initializes the nextBookId to 1.
		and the noOfInstanceCreated=0
	*/
	static
	{
		nextBookId=1;
		noOfInstanceCreated=0;
	}
	/**
		This is a init block which automatically assigns the bookId and increments the noOfInstanceCreated 
	*/
	{
		this.bookId=nextBookId;
		nextBookId++;
		noOfInstanceCreated++;
	}
	/**
		<code>public Student()</code> is the default public constructor
	*/
	public Book()
	{
		this("MepcoLibBook");
	}
	/**
		this is a one parameterised constructor which initializes the title of the book and the price as 100.10
		@param title - title of the book.
	*/
	public Book(String title)
	{
		this(title,100.10);
	}
	/**
		This is a two parameterised constructor which initializes the title and price of the book.
		@param title - title of the book of type String.
		@param price - price of the book of type double.
	*/
	public Book(String title,double price)
	{
		this.title=title;
		this.price=price;
	}
	/**
		This is a copy constructor.
		It copies the title and price of the book instance which is passed as parameter.
		@param bookInstance - of type Book
	*/
	public Book(Book bookInstance)
	{
		this.title=bookInstance.title;
		this.price=bookInstance.price;
	}
	/**
		This method is to print the Book object.
		@return a string having title and price of the book
	*/
	public String toString()
	{
		return ("\t"+this.bookId+"\t"+this.title+"\t"+this.price);
	}
	/**
		This is a setter method which sets the title of the book.
		@param title of type String.
	*/
	public void setTitle(String title)
	{
		this.title=title;
	}
	/**
		This is a setter method which sets the price of the book.
		@param price of type double.
	*/
	public void setPrice(double price)
	{
		this.price=price;
	}
	/**
		This is a getter method which returns the id of the book.
		@return bookId.
	*/
	public int getBookId()
	{
		return this.bookId;
	}
	/**
		This is a getter method which returns the title of the book.
		@return title of type String.
	*/
	public String getTitle()
	{
		return this.title;
	}
	/**
		This is a getter method which returns the price of the book.
		@return price of type double.
	*/
	public double getPrice()
	{
		return this.price;
	}
	/**
		This is a getter method which returns the number of the books created.
		@return noOfInstanceCreated number of books created.
	*/
	public static int getNoOfInstanceCreated()
	{
		return noOfInstanceCreated;
	}
}