import java.util.*;
public class converttomiles{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		
		double km=sc.nextDouble();
		double mile=1.6;
		double distance=km*mile;
		System.out.print("The distance " + km + " km in miles is " + distance );
		
	}
}