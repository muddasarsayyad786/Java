package Exam_self;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class collections {
	Scanner sc = new Scanner(System.in);
	
	ArrayList <Gadget> gadget = new ArrayList<>();
	
	//Add Gadget
	public void addGadget() {
		System.out.println("Enter the categoryln: ");
		String temp = sc.next().trim().toUpperCase();
		Category category = Category.valueOf(temp);
		
		System.out.println("Enter the Stock: ");
		int stock = sc.nextInt();
		
		System.out.println("Enter the Brand: ");
		String brand = sc.next();
		
		System.out.println("Enter the price: ");
		float price = sc.nextFloat();
		
		Gadget g = new Gadget(category, stock, brand, price);
		gadget.add(g);
		System.out.print("Gadget added ");
		
	}
	
	//update stock
	public void updateStock(Category c,int qty) {
		for (Gadget g : gadget) {
			if(c == g.getCategory()) {
				g.setStock(g.getStock()+qty);
				g.setStockUpdateDate(LocalDate.now());
			}
			
		}
	}
	
	//Add a 25% discount on all gadgets that have not been sold in the last 6 months
	public void discount() {
		for (Gadget g : gadget) {
			if ( g.getLastSellDate()==null || g.getLastSellDate().isBefore(LocalDate.now().minusMonths(6))) {
				g.setPrice((float) (g.getPrice()*0.25));
				System.out.print("Price after 25% discount: "+ g.getPrice());
				
			}
		}
	}
	
	//Remove gadgets that were listed over a year ago and have never been sold
	public void removeOld() {
		for (Gadget g : gadget) {
			if (g.getLastSellDate().isBefore(LocalDate.now().minusYears(1)) && g.getListingDate().isBefore(LocalDate.now().minusYears(1))) {
				gadget.remove(g);
				System.out.println(g+"Removed successfully");
			}
		}
	}

	@Override
	public String toString() {
		return "collections [gadget=" + gadget + "]";
	}
	
	
	

}
