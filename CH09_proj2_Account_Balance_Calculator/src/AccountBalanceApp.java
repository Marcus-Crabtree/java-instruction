
public class AccountBalanceApp {

	public static void main(String[] args) {
		// welcome msg + initialization
		//create savings acct andchecking acct with 1,000.00 balance each
		System.out.println("Welcome to the Account Balance Calculator!");
		SavingsAccount sa = new SavingsAccount(1000,.01);
		CheckingAccount ca = new CheckingAccount(1000,1);
		
		System.out.println("Starting Balance: ");
		summarizeAccountBalances(ca,sa);
		System.out.println();
		
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		//get user input - loop through monthly transaction
		// transaction = withdrawl or deposit , checking or saving
		//transtype will be string
		//acctType will be a string
		//amount will be double
		String transType = Console.getString("Withdrawl or Deposit?: (w/d): ", "w", "d");
		String acctType = Console.getString("Withdrawl or Deposit?: (c/s): ", "c", "s");
		double amount = Console.getDouble("Amount? ",0, Double.POSITIVE_INFINITY);
		//biz logic apply transaction to appropriate account
		Account a;
		if (transType.equals("w") {
			a.withdrawl(amount);
		} else {
			a.deposit(amount);
		}
		// end loop ( user enters no to continue)
		choice = Console.getString("Continue? (y/n): ",true);
		}
		//calculate payments and fees
		//apply payments and fees to balances
		
		//summarize payments and fees (dispaly)
		//display final balance
		
		//goodbye
		
		
		
		
		
		

	
	}

}


