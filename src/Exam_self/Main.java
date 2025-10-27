package Exam_self;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		collections c = new collections();
		boolean flag = false;
		while (!flag){
			
			System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add New Gadget");
            System.out.println("2. Update Gadget Stock");
            System.out.println("3. Apply 25% Discount to Unsold Gadgets (6+ months)");
            System.out.println("4. Remove Old Gadgets (1+ year & never sold)");
            System.out.println("5. View All Gadgets");
            System.out.println("6. Exit");
            
            System.out.print("Enter your choice: ");
           
            
            	
            
            
            
            
            int ch = sc.nextInt();
            switch(ch) {
            case 1 : c.addGadget(); break;
            case 2 : 
            	System.out.println("Enter the Catogory: ");
            	String inp=sc.next();
            	Category cat = Category.valueOf(inp.toUpperCase());
            	
            	System.out.println("Enter the qty: ");
            	int qty = sc.nextInt();
            	c.updateStock(cat, qty);
            	break;
            
            case 3:
            	c.discount();break;
            	
            case 4:
            	c.removeOld();
            	
            case 5:
            	for (Gadget g : c.gadget) {
            		System.out.println(g);
            		break;
            	}
            	
            case 6:
            	flag = true;
            	break;	
            }
		}
	}

}
