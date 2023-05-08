package myaccounts;

public class DepositRunnable implements Runnable {

	private static final int DELAY = 10;
	private BankAccount account;
	private double amount;
	private int count;
	
	public DepositRunnable(BankAccount account, double amount, int count) {
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
			account.deposit(amount);
			try {
				Thread.sleep(DELAY);
			}
			catch(Exception e)
			{
				System.out.println(e+"Interrupt");
			}
		}
		
	}
}
