package enums;


/**
 * @author Mahesh Kumar Nanganoori
 *
 */

public enum Genre {

	/**
	 * Enums for Genre
	 */
	BIOGRAPHY(3), DRAMA(5), FANTASY(3),
	HORROR(17), MYSTERY(10), POETRY(1),
	ROMANCE(12), SCIENCE_FICTION(8),
	THRILLER(13);
	
	/**
	 * Private instance variable "age" of type int 
	 */
	private int age;

	/**
	 * A constructor for Enum 
	 * @param age holds the value particular enum
	 */
	private Genre(int age) {
		this.age = age;
	}

	/**
	 * A getter method to get the age of the Enum
	 * @return returns the age of the Enums 
	 */
	public int getAge() {
		return age;
	}
	
	
	
}
