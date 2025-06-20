import java.util.Scanner;

public class CollinearPoints {

    static boolean checkCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    static boolean checkCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter coordinates x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter coordinates x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        boolean slopeMethod = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaMethod = checkCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by Slope: " + slopeMethod);
        System.out.println("Collinear by Area: " + areaMethod);
    }
}
