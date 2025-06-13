import java.util.Scanner;
public class Unitprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitprice= sc.nextInt();
		int quantity=sc.nextInt();
		int total=unitprice * quantity;
        System.out.println( "The total purchase price is INR " + total+ " if the quantity is " +quantity+ " and unit price is INR " +unitprice);
    }
}
