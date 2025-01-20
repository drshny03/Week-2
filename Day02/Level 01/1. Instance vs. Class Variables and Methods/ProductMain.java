// Product class definition
 class Product {
    private String productName;   // Name of the product
    private double price;         // Price of the product
    private static int totalProducts = 0; // Shared among all products, keeps count of total products

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Instance method to display the details of a product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: INR " + price);
    }

    // Class method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

// Main class with the main method
public class ProductMain {
    public static void main(String[] args) {
        // Create product objects
        Product product1 = new Product("Laptop", 50000);
        Product product2 = new Product("Smartphone", 25000);

        // Display details of each product
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        // Display the total number of products
        System.out.println("\nDisplaying Total Products:");
        Product.displayTotalProducts();
    
    }
}
