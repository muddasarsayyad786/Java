package Exam;

import java.time.LocalDate;

public class Gadget {
    private static int idCounter = 1;

    private int id;
    private Category category;
    private LocalDate listingDate;
    private int stock;
    private LocalDate stockUpdateDate;
    private LocalDate lastSellDate;
    private String brand;
    private double price;
    private double discount;

    public Gadget(Category category, int stock, String brand, double price) {
        this.id = idCounter++;
        this.category = category;
        this.listingDate = LocalDate.now();
        this.stock = stock;
        this.stockUpdateDate = LocalDate.now();
        this.brand = brand;
        this.price = price;
        this.discount = 0.0;
        this.lastSellDate = null;
    }

    // Getters and Setters
    public int getId() { return id; }

    public Category getCategory() { return category; }

    public LocalDate getListingDate() { return listingDate; }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        this.stock = stock;
        this.stockUpdateDate = LocalDate.now();
        
    }

    public LocalDate getStockUpdateDate() { return stockUpdateDate; }

    public LocalDate getLastSellDate() { return lastSellDate; }
    public void setLastSellDate(LocalDate lastSellDate) { this.lastSellDate = lastSellDate; }

    public String getBrand() { return brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    @Override
    public String toString() {
        return "ID: " + id + ", Category: " + category + ", Brand: " + brand +
               ", Price: " + price + ", Discount: " + discount + "%" +
               ", Stock: " + stock + ", Listing Date: " + listingDate +
               ", Last Sell Date: " + (lastSellDate != null ? lastSellDate : "Never");
    }
}
