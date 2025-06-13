import java.util.*;
public class studentfee {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
