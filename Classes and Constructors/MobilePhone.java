// MobilePhone class to store and display phone details
class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor to initialize phone attributes
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    // Main method to run the program
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy A52", 24999); // create phone object
        phone.displayDetails();
    }
}
