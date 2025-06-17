import java.util.Scanner;
public class Multiplicationtable{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int mulresult[]=new int[4];
		for(int i=6;i<=9;i++){
		mulresult[i-6]=number*i;
		}
		for(int i=6;i<=9;i++){
		System.out.println(number+"*"+i+"="+mulresult[i-6]);
		}
		sc.close();
	}
}
				
		
		
		