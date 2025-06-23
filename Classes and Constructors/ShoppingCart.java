import java.util.*;

class CartItem {
 // Attributes

    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Total\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = inp.nextInt();
            inp.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = inp.nextLine();
                System.out.print("Enter price: ");
                double price = inp.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = inp.nextInt();

                cart.add(new CartItem(name, price, qty));
                System.out.println("Item added.");
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String name = inp.nextLine();
                cart.removeIf(item -> item.itemName.equalsIgnoreCase(name));
                System.out.println("Item removed (if it existed).");
            } else if (choice == 3) {
                double total = 0;
                for (CartItem item : cart) {
                    total += item.getTotal();
                }
                System.out.println("Total Cost: ₹" + total);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }
}
