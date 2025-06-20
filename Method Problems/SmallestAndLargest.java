import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers separated by space: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

    }
}
