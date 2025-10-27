package opps;

/*
 * 2. Design Account Hierarchy with following specifications:

- The account class has account no, name and balance
- Implement withdraw and deposit methods in the class

- Create Savings and Current as subclasses of Account class

For Savings account min balance of 10000 should be maintained while withdrawal

For current account maximum of 50000 rs can be withdrawn at a time

While deposit in saving max limit is 1 lakh and for current it is 5 lakh
 */

public abstract class Account {
	//instance variable decleared
	int account_number;
	String name;
	double balance;
	
	//constructor for inlizing the instance variable
	public Account(int account_number, String name, double balance) {
		
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
	}
	
	
	// abstract methods which we have to over ride in child class
	public abstract void withdraw(double amount);
	public abstract void deposite(double amount);

	//getter setter to modify instance varibales from any class
	
	public int getAccount_number() {
		return account_number;
	}


	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
