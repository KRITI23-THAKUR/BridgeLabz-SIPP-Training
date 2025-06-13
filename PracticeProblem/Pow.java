import java.util.*;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int a = sc.nextInt();

        int b = (int)Math.pow(a, 2);  // a²
        double c = 3.14 * b;          // π * r²

        System.out.println("Area of circle is: " + c);

        sc.close(); 
    }
}
