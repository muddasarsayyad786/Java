package opps;

/*
 * For Savings account min balance of 10000 should be maintained while withdrawal
 * While deposit in saving max limit is 1 lakh
 */

public class Saving extends Account {

	public Saving(int account_number, String name, double balance) {
		super(account_number, name, balance);
		
		
		
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount <= 1000 ) {
			balance= getBalance() - amount;
			System.out.println("You withdraw Rs: "+amount+" REmaing balance is: "+ balance);
		}
		else {
			System.out.println("For Savings account min balance of 10000 should be maintained while withdrawal");
		}
		
	}

	@Override
	public void deposite(double amount) {
		if (amount <= 100000) {
			balance=getBalance()+amount;
			System.out.println("You deposited Rs: "+amount+" account balance is: "+ balance);
		}
		
		
	}

}
