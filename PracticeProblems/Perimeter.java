 import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Length ");
        int a= sc.nextInt();
		System.out.println("Enter the Width ");
        int b= sc.nextInt();
        int c=2*(a+b);
        System.out.println("The Perimeter is " + c);
    }
}