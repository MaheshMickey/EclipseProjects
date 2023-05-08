/**
 * 
 */
package q19;

/**
 * @author s546551
 *
 */
public class ThreadImplementing implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadImplementing t =  new ThreadImplementing();
		Thread t1 = new Thread(t);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		
	}

}
