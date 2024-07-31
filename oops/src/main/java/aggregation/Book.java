package aggregation;

public class Book {
	
	String bookname;
	int version;
	Author auth;
	
	public Book(String bookname,int version,Author auth )
	{
		this.bookname=bookname;
		this.version=version;
		this.auth=auth;
	}
	
	public void display()
	{
		System.out.println("Book name is: " +bookname);
		System.out.println("Book Version is : " +version);
		System.out.println("Author name is : " +auth.authname);
		System.out.println("Author age is : " +auth.authage);
		
	}
	

	public static void main(String[] args) {
		Author obj1= new Author("Rowling",90);
		Book obj2= new Book("Harry Potter", 2,obj1);
		obj2.display();

	}

}
