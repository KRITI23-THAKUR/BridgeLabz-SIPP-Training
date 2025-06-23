//class name Employee
public class EmployeeDetails {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Salary: ₹" + salary);
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Creating an Employee object
        EmployeeDetails emp = new EmployeeDetails("Harshita Das", 101, 50000.0);

        // Displaying details
        emp.displayDetails();
    }
}
