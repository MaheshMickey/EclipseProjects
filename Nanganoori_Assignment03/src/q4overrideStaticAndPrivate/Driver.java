package q4overrideStaticAndPrivate;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		//p.displayName();
		// We cant call method because parent is private 
		
		
		/**
		 * Using Static 
		 */
		
		Parent p1 = new Child();
		//p1.display();
		// We cant call because the parent method is static 

	}

}
