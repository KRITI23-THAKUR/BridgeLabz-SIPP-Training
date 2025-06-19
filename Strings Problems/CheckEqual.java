import java.util.*;
public class CheckEqual{
	public static boolean compareStringsUsingCharAt(String a,String b){
	 	if(a.length() != b.length()){
		return false;
		}
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)!=b.charAt(i)){
				return false;
			}
		}
		return true;
	

	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("enter string a: " );
		String a=sc.next();
		System.out.print("Enter string b :" );
		String b=sc.next();
		
		System.out.println("string a :" + a);
		System.out.println("String b:" + b);
		
		boolean resultCharAt=compareStringsUsingCharAt(a,b);
		System.out.println("comparison using charAt():" + resultCharAt);
		boolean resultEquals=a.equals(b);
		System.out.println("comparison using equals():" + resultEquals);
		
		if(resultCharAt == resultEquals){
			System.out.println("both the results are same");
		}
		else{
			
			System.out.print("both the result are not same");
		}

			

	}
}
		
		