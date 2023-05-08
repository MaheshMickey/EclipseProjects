package demoforthread;

public class DriverThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GreetingRunnable r1 = new GreetingRunnable("Hello, World!");
		GreetingRunnable r2 = new GreetingRunnable("GoodBye, World!");
		GreetingRunnable r3 = new GreetingRunnable("Hey, Welcome to this world! ");
		GreetingRunnable r4 = new GreetingRunnable("YOU ARE GOOD ");
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4  = new Thread(r4);
		
		//t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.start();
		
		
	}

}
