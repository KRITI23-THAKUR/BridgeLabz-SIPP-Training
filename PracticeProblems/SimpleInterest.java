 import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal ");
        int a= sc.nextInt();
		System.out.println("Enter the Rate ");
        int b= sc.nextInt();
		System.out.println("Enter the Time ");
        int c= sc.nextInt();
        double d=(a*b*c)/100.;
        System.out.println("The Simple Interest for the given amount is " + d);
    }
}