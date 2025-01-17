import java.util.Scanner; // Importing Scanner class for taking user input

// Class representing an Item
public class Item {
    // Attributes to store item details
    String itemName; 
    int itemCode; 
    double price;
     
    // Constructor to initialize the Item object with name, code, and price
    Item(String itemName, int itemCode, double price) {
        this.itemName = itemName; // Assigning item name to the object
        this.itemCode = itemCode; // Assigning item code to the object
        this.price = price; // Assigning item price to the object
    }

    // Method to calculate and display the total cost for a given quantity
    public void display(int quantity) {
        double cost = getCost(quantity); // Calculate the total cost using getCost method

        // Print the total cost and item details
        System.out.println("Total cost of " + quantity + " " + itemName + 
                           " at Price of " + price + " is: " + cost);
    }

    // Method to calculate the cost of items based on quantity
    public double getCost(int quantity) {
        double cost = quantity * price; // Calculate total cost
        return cost; // Return the calculated cost
    }
}

// Main class to test the Item class
class ItemMain {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        
        // Prompt the user to enter item details
        System.out.println("Enter Item Name:");
        String itemName = input.next(); // Reading item name

        System.out.println("Enter Item Code:");
        int itemCode = input.nextInt(); // Reading item code

        System.out.println("Enter Item Price:");
        double price = input.nextDouble(); // Reading item price

        System.out.println("Enter Item Quantity:");
        int quantity = input.nextInt(); // Reading quantity of items

        // Create an Item object with the user-provided details
        Item item = new Item(itemName, itemCode, price);

        // Display the total cost of the items
        item.display(quantity);

        input.close(); // Close the Scanner object
    }
}
