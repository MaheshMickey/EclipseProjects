package movies;

/**
 * 
 * @author Mahesh Kumar Nanganoori
 *
 */
public class Actor extends Person {

	/**
	 * Private instance variables
	 */
	private int age;
	private double remuneration;
	
	/**
	 * Four argument constructor  
	 * @param firstName holds the firstname of the actor
	 * @param lastName holds the lastname of the actor
	 * @param age holds the age of the actor
	 * @param remuneration holds the remuneration of the actor
	 */
	public Actor(String firstName, String lastName, int age, double remuneration) {
		super(firstName, lastName);
		this.age = age;
		this.remuneration = remuneration;
	}
 
	/**
	 * Getter method to get the age of the actor
	 * @return returns the age of type int
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Getter method to get the remuneration of the actor
	 * @return returns the remuneration of type double
	 */
	public double getRemuneration() {
		return remuneration;
	}


	/**
	 * Overriden method 
	 */
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		Actor a = (Actor)o ;
		
		if(this.remuneration>a.remuneration)
		{
			return -1;
		}
		else if(this.remuneration == a.remuneration)
		{
			return 0;
		}
		else {
			return 1;
		}
	}


	/**
	 * toString() to print the output 
	 */
	@Override
	public String toString() {
		return  String.format("%-37s%-8s",super.toString(),"Age: "+age+"\n");
	}
	
	
	
	
	
}
