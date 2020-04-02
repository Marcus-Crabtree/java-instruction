
public class Account implements Depositable, Withdrawlable, Balanceable {
	
	protected double balance;
	
	public Account() {
		super();
	}
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}


	@Override
	public double getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		this.balance = balance;
	}

	@Override
	public void withdrawl(double amount) {
		balance -= amount;

	}

	@Override
	public void deposit(double amount) {
		balance += amount;

	}

}
