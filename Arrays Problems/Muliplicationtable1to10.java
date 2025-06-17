import java.util.Scanner;

public class MultiplicationTable {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int[] mulTable=new int[10];
        for(int i=0;i<10;i++){
            mulTable[i] = number * (i+1);
        }
        for(int i=0;i<10;i++){
            System.out.println(number + " x " + (i+1) + " = " + mulTable[i]);
        }

        scanner.close();
    }
}
