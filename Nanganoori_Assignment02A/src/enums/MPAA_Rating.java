package enums;


/**
 * @author Mahesh Kumar Nanganoori
 *
 */
public enum MPAA_Rating {
	/**
	 * Enums for Movie rating G
	 */
	G(0),
	/**
	 * Enums for Movie rating NC
	 */
	NC_17(18),
	/**
	 * Enums for Movie rating PG12
	 */
	PG(12),
	/**
	 * Enums for Movie rating PG13
	 */
	PG_13(13),
	/**
	 * Enums for Movie rating R
	 */
	R(17);
	
	/**
	 * Private instance variable to hold the age 
	 */
	private int age;

	/**
	 * Constructor to assign the age value
	 * @param age
	 */
	private MPAA_Rating(int age) {
		this.age = age;
	}
	
	/**
	 * Getter method to get the age of the enum
	 * @return returns the age of the specified enum 
	 */

	public int getAge() {
		return age;
	}
	
	

}
