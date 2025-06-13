 import java.util.*;
public class CalculateAvg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number ");
        int a= sc.nextInt();
	    System.out.println("Enter the Second number ");
        int b= sc.nextInt();
		System.out.println("Enter the Third number ");
        int c= sc.nextInt();
        double d=(a+b+c)/3.;
        System.out.println("The Average is " + d);
    }
}