package myaccounts;

public class WithdrawRunnable implements Runnable{

	private static final int DELAY = 10;
	private BankAccount account;
	private double amount;
	private int count;
	
	

	public WithdrawRunnable(BankAccount account, double amount, int count) {
		super();
		this.account = account;
		this.amount = amount;
		this.count = count;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
		{
			//account.setBalance(amount);
			try {
				account.withdraw(amount);
				Thread.sleep(DELAY);
			}
			catch(Exception e)
			{
				System.out.println(e+"Interrupt");
			}
		}
		
	}

}
