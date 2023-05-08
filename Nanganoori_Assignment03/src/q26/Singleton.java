package q26;

public class Singleton {
	
	private static Singleton in = null;
	
	public String s ;

	private Singleton() {
		super();
		s = "In Singleton Class";
	}
	
	 public static Singleton getInstance()
	    {
	        if (in == null)
	            in = new Singleton();
	  
	        return in;
	    }
	

}
