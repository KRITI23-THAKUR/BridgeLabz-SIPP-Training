import java.util.Scanner;

public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the dividend: ");

        int number = s.nextInt();
        System.out.print("Enter the divisor: ");

        int divisor = s.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        }
        else {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
    }
}
