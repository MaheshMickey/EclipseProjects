package q20;

public class Thread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	     System.out.println("Thread 2 started");
	     for(int i=0;i<=3;i++)
	     {
	    	 System.out.println(i);
	     }
	     System.out.println("Thread2 completed");
	}
}
	

