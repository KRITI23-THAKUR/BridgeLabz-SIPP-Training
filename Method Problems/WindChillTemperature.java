import java.util.Scanner;

public class WindChillTemperature {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 13.12 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed, 0.16)
                + 0.3965 * temperature * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temperature = s.nextDouble();
        System.out.print("Enter wind speed in km/h: ");
        double windSpeed = s.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is: %.2f°C%n", windChill);
    }
}
