
package myaccounts;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private double balance;
	private Lock balanceChangeLock;
	private Condition sufficientFundsCondition;

	public BankAccount() {
		super();
		this.balance = 0; 
		balanceChangeLock = new ReentrantLock();
		sufficientFundsCondition = balanceChangeLock.newCondition();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		balanceChangeLock.lock();
		try {
		System.out.println("Depositing:" +amount);
		double newBalance  = getBalance() + amount;
		System.out.println("New Balance:" +newBalance);
		balance = newBalance;
		sufficientFundsCondition.signalAll();
		}
		finally {
			balanceChangeLock.unlock();
		}	
	}
	
	public void withDraw(double amount) throws InterruptedException
	{
		balanceChangeLock.lock();
		try {
			while(balance < amount)
			{
				sufficientFundsCondition.await();
			}
			System.out.println("Withdrawing:" +amount);
			double newBalance  = getBalance() - amount;
			balance = newBalance;
			System.out.println("New Balance:" +newBalance);
		}
		finally {
			balanceChangeLock.unlock();
		}
	}
}
