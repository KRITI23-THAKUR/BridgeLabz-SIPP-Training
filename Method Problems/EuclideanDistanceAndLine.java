import java.util.Scanner;

public class EuclideanDistanceAndLine {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x1: ");

        double x1 = s.nextDouble();
        System.out.print("Enter y1: ");

        double y1 = s.nextDouble();
        System.out.print("Enter x2: ");

        double x2 = s.nextDouble();
        System.out.print("Enter y2: ");

        double y2 = s.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean distance: %.4f%n", distance);
        System.out.printf("Equation of line: y = %.4fx + %.4f%n", lineEquation[0], lineEquation[1]);

    }
}
