import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize cart item details
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost of the item (price * quantity)
    public double getTotalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    // Arrays to store cart items, prices, and quantities
    CartItem[] cartItems = new CartItem[10];
    int itemCount = 0; // To track the number of items in the cart

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println(itemName + " has been added to the cart.");
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;

        // Loop through the cart items to find and remove the item
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equals(itemName)) {
                // Shift items left to remove the item
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null; // Nullify last item
                itemCount--;
                System.out.println(itemName + " has been removed from the cart.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found in the cart.");
        }
    }

    // Method to display the total cost of the cart
    public void displayTotalCost() {
        double totalCost = 0;

        // Loop through all items in the cart and calculate total cost
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotalCost();
        }

        System.out.println("Total cost of items in the cart: $" + totalCost);
    }
}

class ShoppingCartMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            // Displaying menu options
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            // Switch statement to handle different options
            switch (choice) {
                case 1: // Add item to cart
                    System.out.print("Enter item name: ");
                    input.nextLine(); // Consume newline character
                    String itemName = input.nextLine();
                    System.out.print("Enter item price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = input.nextInt();
                    cart.addItem(itemName, price, quantity); // Add item to cart
                    break;

                case 2: // Remove item from cart
                    System.out.print("Enter item name to remove: ");
                    input.nextLine(); // Consume newline character
                    String itemToRemove = input.nextLine();
                    cart.removeItem(itemToRemove); // Remove item from cart
                    break;

                case 3: // Display total cost
                    cart.displayTotalCost(); // Display total cost of items in the cart
                    break;

                case 4: // Exit
                    System.out.println("Exiting the Shopping Cart System. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
