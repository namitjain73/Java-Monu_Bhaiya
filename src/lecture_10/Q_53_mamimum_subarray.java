package lecture_10;
import java.util.*;

public class Q_53_mamimum_subarray {

	public static void main(String[] args) {
		int[] arr = {-2 , 1 , -3 , 4 , -1, 2,1,-5,4};
		System.out.print(maximum_sum(arr));
		
		

	}
	
	public static int maximum_sum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			int sum = 0;
			for(int j = i ; j < arr.length ; j++) {
				sum += arr[j];
				ans = Math.max(ans,  sum);
				if(sum < 0) {
					sum= 0;
				}
			}
		}
		return ans;
	}

}
