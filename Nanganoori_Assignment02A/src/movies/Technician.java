/**
 * 
 */
package movies;

import enums.Roles;

/**
 * @author S546551
 *
 */
public class Technician extends Person {
	
	Roles role;

	
	public Technician(String firstName, String lastName, Roles role) {
		super(firstName, lastName);
		this.role = role;
	}
	
	public Roles getRole() {
		return role;
	}


	


	@Override
	public String toString() {
		return super.toString()+" 		"+getRole();
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		Technician t = (Technician)o;
		return this.role.compareTo(t.role);
	}

}
