package recursion;

import java.util.Scanner;

public class NoOfPaths {

	static int paths(int r,int c) {
		if(r==1 || c==1) return 1;
		return paths(r,c-1)+paths(r-1,c);
	}
	public static void main(String[] args) {
		System.out.println("Enter no.of rows and columns:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int ans=paths(r,c);
		System.out.println(ans);
		
	}


}
