https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class BookPersist {
public static void main(String [] args){
	 String filename = "books";

	 Book book1 = new Book();
	 book1.setTitle(new String("Network Security"));
	 book1.setAuthor(new String("Mark Ciampa"));
	 book1.setPublisher(new String("Thomson Course Technology"));
	 book1.setYear(new String("2005"));
	 book1.setISBN(new String("0-619-21566-6"));

	 Book book2 = new Book();
	 book2.setTitle(new String("Firewalls and Network Security"));
	 book2.setAuthor(new String("Greg Holden"));
	 book2.setPublisher(new String("Thomson Course Technology"));
	 book2.setYear(new String("2005"));
	 book2.setISBN(new String("0-619-13039-3"));
	 
	System.out.println("Book 1 ......");
	System.out.println("Book Title: " + book1.getTitle());
	System.out.println("Book Author: " + book1.getAuthor());
	System.out.println("Publish Year: " + book1.getYear());
	System.out.println("ISBN: " + book1.getISBN());
	System.out.println("Book 2 ......");
	System.out.println("Book Title: " + book2.getTitle());
	System.out.println("Book Author: " + book2.getAuthor());
	System.out.println("Publish Year: " + book2.getYear());
	System.out.println("ISBN: " + book2.getISBN());
	System.out.println();

     FileOutputStream fos = null;
     ObjectOutputStream out = null;
     try
     {
       fos = new FileOutputStream(filename);
       out = new ObjectOutputStream(fos);
       out.writeObject(book1);
       out.writeObject(book2);
       out.close();
       System.out.println("The objects of above two books are successfully persisted onto the hard drive!");
     }
     catch(IOException ex)
     {
       ex.printStackTrace();
     }
   }
 }
