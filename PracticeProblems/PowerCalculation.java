 import java.util.*;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Base ");
        int a= sc.nextInt();
		System.out.println("Enter the Exponent ");
        int b= sc.nextInt();
        int c=Math.pow(a,b)
        System.out.println("The Power is " + c);
    }
}
