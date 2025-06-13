import java.util.*;
public class Temp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius ");
        int a= sc.nextInt();
        double c=(a*9/5)+32.;
        System.out.println("Temperature in Fahrenheit is " + c);
    }
}