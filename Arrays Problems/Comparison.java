import java.util.Scanner;
public class Comparison{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int number[]=new int[5];
		System.out.println("enter 5 numbers");
		for(int i=0;i<5;i++){
			number[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
			System.out.println("for number "+ number[i]+":");

			if(number[i]==0){
				System.out.println("number is zero");
			}
			else if(number[i]>0){
				System.out.println("number is positive");
				if(number[i]%2==0){
					System.out.println("number is even");
				}
				else{
					System.out.println("number is odd");
				}
			}
			
			else{
				System.out.println("number is negative");
			}
		}
		int first=number[0];
		int last=number[number.length-1];
		if(first==last){
			System.out.println("numbers are equal");
		}
		else if(first>last){
			System.out.println("first number is greater than last");
		}
		else{
			System.out.println("last is greater than first");
		}
		sc.close();
	}
}
		
		
