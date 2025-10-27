package opps;

//class is abstract beacuse abstract method is definded in class
public abstract class Vehical {
	//this are the instance variables
	int reg_no;
	String make;
	String model;
	double price;
	
	//constructor for initlizing values
	public Vehical(int reg_no, String make, String model, double price) {
		
		this.reg_no = reg_no;
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	//adding getter setter for accecing values from any class
	public int getReg_no() {
		return reg_no;
	}

	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	// make abstract class which can be over ride in child class
	public abstract double calculateInsurance();
	
	public void display(){
		
		System.out.println("Calling from parant class");
		System.out.println("Register no: "+ getReg_no());
		System.out.println("Insurance amount: "+ calculateInsurance() );
		
	}
	
	
	
	
	

}
