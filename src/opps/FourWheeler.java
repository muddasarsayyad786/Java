package opps;

public class FourWheeler extends Vehical implements Rentable {

	public FourWheeler(int reg_no, String make, String model, double price) {
		super(reg_no, make, model, price);
		System.out.println("Calling from child 4 Wheeler");
	}

	@Override
	public double calculateInsurance() {
		System.out.print("Its a four wheeler: ");
		double inc_amount = getPrice() * 0.05;
		
		
		return inc_amount;
		
	}
	
	public void rentable(double hrs) {
		if (hrs > 3) {
			double rent=(hrs*500)+((hrs-3)*200);
			System.out.println("Rent for car is: "+rent);
		}
		else {
			double rent = hrs*500;
			System.out.println("Rent for car is: "+rent);
			
		}
		
	}
	
	

}
