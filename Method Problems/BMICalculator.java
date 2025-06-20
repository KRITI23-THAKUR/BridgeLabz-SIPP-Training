import java.util.Scanner;

public class BMICalculator {

    static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    static String[] determineStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            people[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            people[i][1] = sc.nextDouble();
        }

        calculateBMI(people);
        String[] status = determineStatus(people);

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf( "%.1f\t%.1f\t%.2f\t%s\n",people[i][1], people[i][0], people[i][2], status[i]);
        }
    }
}
