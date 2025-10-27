package opps;

public class Current extends Account {
	public Current(int account_number, String name, double balance) {
		
		super(account_number, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount <= 50000 ) {
			balance= getBalance() - amount;
			System.out.println("You withdraw Rs: "+amount+" REmaing balance is: "+ balance);
		}
		else {
			System.out.println("For Savings account min balance of 500000 should be maintained while withdrawal");
		}
		
	}

	@Override
	public void deposite(double amount) {
		if (amount <= 500000) {
			balance=getBalance()+amount;
			System.out.println("You deposited Rs: "+amount+" account balance is: "+ balance);
		}
		
		
		
	}


}
