package stacksanddeques;

/**
 * 
 * @author S546551 Mahesh Kumar Nanganoori
 *
 */
public class Book {
	private String title;
	private String author;
	
	/**
	 * Two arg constructor
	 * @param title holds the title of the book
	 * @param author holds the author name of the book
	 */
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	/**
	 * Getter method to get the title
	 * @return returns the title of book
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter method to set the title name
	 * @param title holds the title name 
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Getter method to get the author name
	 * @return returns the author name
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Setter method to set the author name
	 * @param author holds the author name
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * To string() to print the output in a string format
	 */

	@Override
	public String toString() {
		return  title +"\n " + author ;
	}
	
	
	
	

}
