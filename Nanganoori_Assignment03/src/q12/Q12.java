package q12;

public class Q12 {

	public static void main(String[] args) {
    final int age = 10;
	try {
		int i = 0;
		while(i<5)
		{
			System.out.println(i);
			i++;
			System.gc();
		}
		
	}
	catch(Exception e)
	{
		System.out.println("Exception"+e);
	}
	
	// finally is a block used to execute the if any exceptions are found in code
	
	finally {
		System.out.println("In finally block");
	}	
}
	protected void finalize() throws Throwable{
		System.out.println("called finalize");
	}
}

