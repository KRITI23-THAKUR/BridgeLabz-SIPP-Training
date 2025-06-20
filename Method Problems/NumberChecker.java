public class NumberChecker {
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145};
        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Perfect Number: " + isPerfectNumber(num));
            System.out.println("Abundant Number: " + isAbundantNumber(num));
            System.out.println("Deficient Number: " + isDeficientNumber(num));
            System.out.println("Strong Number: " + isStrongNumber(num));
            System.out.println();
        }
    }
}
