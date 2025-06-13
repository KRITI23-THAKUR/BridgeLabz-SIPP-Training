import java.util.*;
public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        int remainder=number1%number2;
        int quotient = number1 / number2;

        System.out.println("the quotient is " + quotient+ " and the remainder is " + remainder+ " of the two numbers " + number1+ " and " +number2);
    }
}
