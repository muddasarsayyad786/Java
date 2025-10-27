package opps;

public class RentAdmin implements Rentable {
	
	public RentAdmin(){
	Vehical[] v = new Vehical [5];
	v[0]=new TwoWheeler(123,"ass","xyz",5673);
	v[1]=new FourWheeler(124,"ass","xyz",56730);
	v[2]=new FourWheeler(125,"ass","xyz",56730);
	v[3]=new FourWheeler(126,"ass","xyz",56730);
	v[4]=new TwoWheeler(125,"ass","xyz",5673);
	
	Vehical[] r = new Vehical [5];
	r[0] = new TwoWheeler(123,"ass","xyz",0);
	r[1] = new FourWheeler(124,"ass","xyz",0);
	
	}
	
	public void display_inc() {
		for(Vehical i : v) {
			System.out.print(i.calculateInsurance());
		}
		
	
	}
	public void display_rent() {
		for (Vehical i : r) {
			System.out.println(i.rentable())
		}
	}

}
