import java.util.*;
public class operationdouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		System.out.print("Enter third number: ");
		double c = sc.nextDouble();
        double op1 =a+ b *c;
        double op2 =a*b+c;
		double op3 =c+a/b;
		double op4 =a%b+c;

        System.out.println("the result of double operation are " + op1 + "," +op2+ "," +op3+ " and " + op4);
    }
}