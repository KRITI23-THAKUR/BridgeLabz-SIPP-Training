import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");

        double principal = s.nextDouble();
        System.out.print("Enter Rate of Interest: ");

        double rate = s.nextDouble();
        System.out.print("Enter Time (in years): ");

        double time = s.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n", simpleInterest, principal, rate, time);

    }
}
