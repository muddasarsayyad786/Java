package Exam;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class AdminConsole {
    private static Map<Integer, Gadget> gadgetInventory = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add New Gadget");
            System.out.println("2. Update Gadget Stock");
            System.out.println("3. Apply 25% Discount to Unsold Gadgets (6+ months)");
            System.out.println("4. Remove Old Gadgets (1+ year & never sold)");
            System.out.println("5. View All Gadgets");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: addNewGadget(); break;
                    case 2: updateGadgetStock(); break;
                    case 3: applyDiscount(); break;
                    case 4: removeOldGadgets(); break;
                    case 5: viewAllGadgets(); break;
                    case 6: exit = true; break;
                    default: System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Exiting Admin Console.");
    }

    private static void addNewGadget() {
        try {
            System.out.print("Enter Category (LAPTOP, SMARTPHONE, TABLET): ");
            Category category = Category.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Enter Brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter Price (INR): ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Stock: ");
            int stock = Integer.parseInt(scanner.nextLine());

            Gadget gadget = new Gadget(category, stock, brand, price);
            gadgetInventory.put(gadget.getId(), gadget);

            System.out.println("Gadget added successfully with ID: " + gadget.getId());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter valid values.");
        }
    }

    private static void updateGadgetStock() {
        try {
            System.out.print("Enter Gadget ID to update stock: ");
            int id = Integer.parseInt(scanner.nextLine());

            Gadget gadget = gadgetInventory.get(id);
            if (gadget == null) {
                System.out.println("Gadget not found.");
                return;
            }

            System.out.print("Enter new stock quantity: ");
            int newStock = Integer.parseInt(scanner.nextLine());
            gadget.setStock(newStock);

            System.out.println("Stock updated successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }
    }

    private static void applyDiscount() {
        LocalDate sixMonthsAgo = LocalDate.now().minusMonths(6);

        gadgetInventory.values().stream()
            .filter(g -> g.getLastSellDate() == null || g.getLastSellDate().isBefore(sixMonthsAgo))
            .forEach(g -> g.setDiscount(25.0));

        System.out.println("25% discount applied to applicable gadgets.");
    }

    private static void removeOldGadgets() {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        List<Integer> gadgetsToRemove = gadgetInventory.values().stream()
            .filter(g -> g.getListingDate().isBefore(oneYearAgo) && g.getLastSellDate() == null)
            .map(Gadget::getId)
            .collect(Collectors.toList());

        for (int id : gadgetsToRemove) {
            gadgetInventory.remove(id);
        }

        System.out.println(gadgetsToRemove.size() + " old unsold gadgets removed.");
    }

    private static void viewAllGadgets() {
        if (gadgetInventory.isEmpty()) {
            System.out.println("No gadgets available.");
            return;
        }
        gadgetInventory.values().forEach(System.out::println);
    }
}
