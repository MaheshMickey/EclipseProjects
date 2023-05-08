package demoforthread;

import java.util.Date;

public class GreetingRunnable implements Runnable {

	private String greeting;
	//private static final int REPETITIONS = 10;
	//private static final int DELAY = 1000;

	public GreetingRunnable(String greeting) {
		super();
		this.greeting = greeting;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++)
		{
			Date now = new Date();
			System.out.println(now +" " +greeting);
			try {
				//sleep() uses milliseconds of time 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupt");
				return;
			}
		}
		
	}
	
	
}
