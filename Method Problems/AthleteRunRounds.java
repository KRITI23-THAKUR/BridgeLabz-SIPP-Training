import java.util.Scanner;

public class AthleteRunRounds {
    
    public static int computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000.0; 
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangular park (in meters): ");

        double side1 = s.nextDouble();
        System.out.print("Enter side 2 of the triangular park (in meters): ");

        double side2 = s.nextDouble();
        System.out.print("Enter side 3 of the triangular park (in meters): ");

        double side3 = s.nextDouble();

        int rounds = computeRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");
    }
}
