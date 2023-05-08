package q19;

public class ThreadClassExtending extends Thread {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClassExtending e = new ThreadClassExtending();
		e.start();

	}

}
