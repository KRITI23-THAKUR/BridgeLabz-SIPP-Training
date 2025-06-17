import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (positive integer).");
            sc.close();
            return;
        }

        
        int size = number / 2 + 1;
        int[] even = new int[size];
        int[] odd = new int[size];

        int evenIndex = 0;
        int oddIndex = 0;

        // Step 4: Fill arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        sc.close();
    }
}
