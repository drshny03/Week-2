// ShoppingCartMain class containing the main method
public class ShoppingCartMain {
    public static void main(String[] args) {
        // Set an initial discount for all products
        Product.updateDiscount(10);

        // Create product objects
        Product product1 = new Product("Laptop", 75000, 1, "P001");
        Product product2 = new Product("Smartphone", 30000, 2, "P002");

        // Display the details of each product
        if (product1 instanceof Product) {
            product1.displayDetails();
        }

        if (product2 instanceof Product) {
            product2.displayDetails();
        }

        // Update the discount percentage
        Product.updateDiscount(15);

        // Display the updated discount for all products
        System.out.println("Updated Discount: " + Product.getDiscount() + "%");

        // Display the details again with the updated discount
        if (product1 instanceof Product) {
            product1.displayDetails();
        }

        if (product2 instanceof Product) {
            product2.displayDetails();
        }
    }
}

// Product class to manage shopping cart items
class Product {
    // Static variable shared by all products
    private static int discount;

    // Final variable to ensure each product has a unique identifier
    private final String productID;

    // Instance variables for product details
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize instance variables
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }

    // Static method to get the current discount percentage
    public static int getDiscount() {
        return discount;
    }

    // Method to display product details
    public void displayDetails() {
        double discountedPrice = price - (price * discount / 100);
        discountedPrice = discountedPrice*quantity;
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: INR " + price);
        System.out.println("Total Discounted Price: INR " + discountedPrice);
        System.out.println("Quantity: " + quantity);
        
    }
}
