package q20;

public class ThreaStated extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 started");
		for(int i = 0; i<=2;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Thread 1 is completed");
	}
}

