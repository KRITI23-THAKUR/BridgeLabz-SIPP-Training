import java.util.Scanner;
public class StoreMultipleValues{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double vararr[]=new double[10];
	int index=0;
	double total=0.0;	
	while(true){
		if(index==10){
			break;
		}
		System.out.print("Enter the number:");
		double number=sc.nextDouble();
		if(number==0){
			break;
		}
		vararr[index]=number;
		index++;
	}
		

	for(int j=0;j<index;j++){
		total=total+vararr[j];
	}
	System.out.print("Total sum :" + total);
	sc.close();
	}
}
		
		

	



