import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create a String array to store the results
        String[] FizzBuzz= new String[number + 1]; // includes position 0

        // Loop from 0 to the number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                FizzBuzz[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                FizzBuzz[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                FizzBuzz[i] = "Buzz";
            } else {
                FizzBuzz[i] = String.valueOf(i);
            }
        }

        // Display the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + FizzBuzz[i]);
        }

        scanner.close();
    }
}
