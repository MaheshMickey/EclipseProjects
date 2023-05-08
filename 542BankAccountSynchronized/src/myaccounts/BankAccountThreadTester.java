package myaccounts;

public class BankAccountThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account  = new BankAccount();
		final double AMOUNT = 100;
		final int REPETITIONS = 1000;
		
		DepositRunnable dr  = new DepositRunnable(account, AMOUNT, REPETITIONS);
		WithdrawRunnable wr = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
		
		Thread t1 =new Thread(dr);
		Thread t2 =new Thread(wr);
		
		t1.start();
		t2.start();	

	}


	}

