package opps;

public class TwoWheeler extends Vehical implements Rentable {
	
	//created construtor of class
	public TwoWheeler(int reg_no, String make, String model, double price) {
		super(reg_no, model, model, price); // used super keyword to extend properties from parant
		System.out.println("Calling from child Two Wheeler");
		
	}

	@Override
	public double calculateInsurance() {
		System.out.print("Its a two wheeler: ");
		double inc_amount = getPrice() * 0.05;
		
		
		return inc_amount;
	}

	@Override
	public void rentable(double hrs) {
		if (hrs > 3) {
			double rent=(hrs*300)+((hrs-3)*100);
			System.out.println("Rent for bike is: "+rent);
		}
		else {
			double rent = hrs*300;
			System.out.println("Rent for bike is: "+rent);
			
		}
		
	}
	
	
	
	
		
}
