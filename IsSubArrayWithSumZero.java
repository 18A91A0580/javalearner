package sets;

import java.util.*;

public class IsSubArrayWithSumZero {

	public static void main(String[] args) {
		int a[]= {2,1,3,-4,-2};
		Set<Integer> s=new HashSet<>();
		boolean found=false;
		int sum=0;
		for(int e: a) {
			sum += e;
			s.add(sum);
			if(s.contains(sum)) {
				
				found=true;
				break;
			}
		}
		System.out.println(found);
	}

}
