package linkedlist;

import java.util.Objects;

/**
 * 
 * @author S546551 Mahesh Kumar Nanganoori
 *
 */
public class Student {
	/**
	 * Two private instance variables name and id
	 */
	private String name;
	private int id;
	
	/**
	 * Two arg constructor for Student class
	 * @param name holds the name of the student 
	 * @param id holds the id of the student
	 */
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	/**
	 * Getter method to get the name of the student 
	 * @return returns  name of type string
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method to set the name 
	 * @param name hold the name of type string
	 */

	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Getter method to get the id of the stduent 
	 * @return returns the id of type int
	 */
	public int getId() {
		return id;
	}


	/**
	 * Setter method to set the id
	 * @param id holds the id of student
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	

}
