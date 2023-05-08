package q2;

public class AccessModifier extends A{

	   /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        AccessModifier am = new AccessModifier();
	        am.displaymethod();
	    }
	    public void displaymethod()
	    {
	        System.out.println("Welcome to NWMSU");
	    }
	}

	class A {
	    protected void displaymethod()
	    {
	        System.out.println("Welcome to NWMSU");
	    }
	}