package recursion;
import java.util.*;
public class SumOfNNumbers {
	static int sum(int n) {
		if(n==1) return 1;
		return sum(n-1)+n;
	}
	public static void main(String[] a) {
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=sum(n);
		System.out.println(ans);
		
	}
	
}
