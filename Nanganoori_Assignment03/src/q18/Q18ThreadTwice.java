/**
 * 
 */
package q18;

/**
 * @author s546551
 *
 */
public class Q18ThreadTwice extends Thread {
	
@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In run method");
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Q18ThreadTwice  q = new Q18ThreadTwice();
	q.start();
	q.start();
		

	}
}
