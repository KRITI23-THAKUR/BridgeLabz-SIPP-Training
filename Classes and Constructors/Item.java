// Item class to track item details and calculate total cost
class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor to initialize item attributes
    Item(int code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Item item = new Item(101, "Pen", 12.5); // create item
        item.displayDetails();
        int quantity = 10;
        System.out.println("Total Cost for " + quantity + " items: ₹" + item.calculateTotalCost(quantity));
    }
}
