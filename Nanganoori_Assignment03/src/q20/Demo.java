/**
 * 
 */
package q20;

/**
 * @author s546551
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread is in New state 
		ThreaStated t1= new ThreaStated();	
		Thread2 t2 = new Thread2();
		//Running the thread 1 
		t1.start();
		//Giving the control to next thread
		t2.yield();
		try {
			t1.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t2.start();
		System.out.println("Main thread end");

	}

}
