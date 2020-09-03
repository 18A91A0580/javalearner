package recursion;

import java.util.Scanner;

public class FastPower {

	static int pow(int a,int b) {
		if(b==0) return 1;
		if(b%2==0) return pow(a*a,b/2);
		return pow(a,b-1)* a;
	}
	public static void main(String[] args) {
		System.out.println("Enter a and b values :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=pow(a,b);
		System.out.println(ans);
		
	}

}
