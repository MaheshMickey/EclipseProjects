package q3;

public class CovarientDemo extends A{

	   /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        new CovarientDemo().get().message();    
	    }
	    @Override  
	    CovarientDemo get(){
	        return this;
	    }    
	    void message(){
	        System.out.println("welcome to covariant return type");
	    }
	}



	class A{    
	    A get(){
	        return this;
	    }    
	}
