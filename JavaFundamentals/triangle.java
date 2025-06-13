import java.util.*;
public class triangle {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double height = sc.nextDouble();
		double base = sc.nextDouble();
        double area=0.5*base*height;
		double inch=area/2.54;
		System.out.println( "area in cm is " +area+ " and area in inches is " +inch);
        
    }
}
