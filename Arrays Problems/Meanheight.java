import java.util.Scanner;
public class Meanheight{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double heights[]=new double[11];
	double sum=0;
	for(int i=0;i<heights.length;i++){
		System.out.print("Enter the heights of player:");
		heights[i]=sc.nextDouble();
	}
	for(int i=0;i<heights.length;i++){
	sum +=heights[i];
	}
	double mean=sum/11;
	System.out.print("mean height of the players in a football team is :" + mean);
	}
}
	
		
	
	
	
	
	