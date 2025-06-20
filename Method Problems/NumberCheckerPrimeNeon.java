public class NumberCheckerPrimeNeon {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }


    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }


    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }


    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }


    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int testNumber = 7;
        System.out.println("Number: " + testNumber);
        System.out.println("Is prime: " + isPrime(testNumber));
        System.out.println("Is neon number: " + isNeonNumber(testNumber));
        System.out.println("Is spy number: " + isSpyNumber(testNumber));
        System.out.println("Is automorphic: " + isAutomorphic(testNumber));
        System.out.println("Is buzz number: " + isBuzzNumber(testNumber));
    }
}
