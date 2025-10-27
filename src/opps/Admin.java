package opps;

public class Admin {

	public static void main(String[] args) {
		Account acc = new Saving(123,"Max", 3000000);
		Account acc2 = new Current(124,"Sam", 2000000);
		acc2.withdraw(50000);
		acc.deposite(1000);
		
		
	}

}
