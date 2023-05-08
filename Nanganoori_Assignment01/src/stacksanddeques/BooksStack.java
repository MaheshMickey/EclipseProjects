package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author S546551 Mahesh Kumar Nanganoori
 *
 */
public class BooksStack {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		AStack<Book> books = new AStack<Book>();
		Scanner scan = new Scanner(new File("books.txt"));
		while(scan.hasNext())
		{
			String title = scan.nextLine();
			String author = scan.nextLine();
			Book book1 = new Book(title,author);
			books.getMyStack().push(book1);
		}
			
			System.out.println("All books in the stack from top to bottom\n"+
			"-------------------------------------");
			
			for(Book b : books.getMyStack())
			{
				System.out.println(b.getTitle() +"\n"+ b.getAuthor()+"\n"+
						"-------------------------------------");
			}
			
			System.out.println("Stack after removing book with name Fantastic Beasts:"
					+ " The Crimes of Grindelwald"+"\n-------------------------------------");
			
			
			Iterator<Book> book_Iterator = books.getMyStack().iterator();
			while(book_Iterator.hasNext())
			{
				Book b = book_Iterator.next();
				if(b.getTitle().contains("Fantastic Beasts: The Crimes of Grindelwald"))
				{
					book_Iterator.remove();
				}
			}
			
			for(Book b :books.getMyStack()) {
				System.out.println(b.getTitle()+"\n"+
						b.getAuthor()+"\n"+"-------------------------------------");
				
			}	
	}

}
