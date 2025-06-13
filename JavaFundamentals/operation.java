import java.util.*;
public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
        int op1 =a+ b *c;
        int op2 =a*b+c;
		int op3 =c+a/b;
		int op4 =a%b+c;

        System.out.println("the result of int operation are " + op1 + "," +op2+ "," +op3+ " and " + op4);
    }
}
