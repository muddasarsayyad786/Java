package Exam_self;

import java.time.LocalDate;

public class Gadget {
	static int id;
	Category category;
	LocalDate listingDate;
	int stock;
	LocalDate stockUpdateDate;
	LocalDate lastSellDate;
	String brand;
	float price;
	double discount;
	
	public Gadget(Category category,  int stock, String brand, float price) {
		
		Gadget.id++;
		this.category = category;
		this.listingDate = LocalDate.now();
		this.stock = stock;
		this.stockUpdateDate = LocalDate.now();
		this.lastSellDate = null;
		this.brand = brand;
		this.price = price;
		this.discount =  0.0;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getListingDate() {
		return listingDate;
	}

	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
		this.stockUpdateDate= LocalDate.now();
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
		
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public LocalDate getLastSellDate() {
		return lastSellDate;
	}

	public void setLastSellDate(LocalDate lastSellDate) {
		this.lastSellDate = lastSellDate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float d) {
		this.price = d;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public static int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Gadget [category=" + category + ", listingDate=" + listingDate + ", stock=" + stock
				+ ", stockUpdateDate=" + stockUpdateDate + ", lastSellDate=" + lastSellDate + ", brand=" + brand
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	
	

	
	
	
	
	
	
	

}
