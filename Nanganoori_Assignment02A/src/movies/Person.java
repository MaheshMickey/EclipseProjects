package movies;

import java.util.Objects;

/**
 * 
 * @author Mahesh Kumar Nanganoori
 *
 */
public abstract class Person implements Comparable<Person> {

	/**
	 * private instance variables 
	 */
	private String firstName;
	private String lastName;
	
	/**
	 * Two argument constructor of type Person
	 * @param firstName holds the firstname of the person
	 * @param lastName holds the lastname of the person
	 */
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	/**
	 * Getter method to get the first name of the person
	 * @return returns the firstname of the person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Getter method to get the lastname of the person
	 * @return returns the lastname of the person
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Overriden method for type Comparable interface
	 */
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
	
	/**
	 * Overriden method of type Comparable interface
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}


	/**
	 * toStroing() method to print the output 
	 */
	@Override
	public String toString() {
		return  firstName +" "+lastName ;
	}

/**
 * Overriden abstract method to compare two Objects
 */
	@Override
	public abstract int compareTo(Person o);

	
	
	
}
