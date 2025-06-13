import java.util.Scanner;
public class handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalstudents= sc.nextInt();
		int totalhandshake=(totalstudents*(totalstudents-1))/2;
        System.out.println( "The total no of handshake is "+ totalhandshake);
    }
}
