https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class GetBookDetails  {
  public static void main(String [] args) {
	   String filename = "books"; 

	   Book book1 = null;
	   Book book2 = null;
	   FileInputStream fis = null;
	   ObjectInputStream in = null;
	   try
	   {
	     fis = new FileInputStream(filename);
	     in = new ObjectInputStream(fis);
	     book1 = (Book)in.readObject();
		 book2 = (Book)in.readObject();
	     in.close();
	   }
	   
	   catch(IOException ex) {
	     ex.printStackTrace();
	   }
	   
	   catch(ClassNotFoundException ex){
	     ex.printStackTrace();
	   }
	   
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
	   System.out.println("The two book objects are successfully restored from the permanent storage!");
   
 }
}
