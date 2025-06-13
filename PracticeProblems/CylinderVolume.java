import java.util.*;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The volume of the cylinder is: " + volume);

        sc.close();
    }
}
