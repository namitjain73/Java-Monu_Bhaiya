package lecture_10;

public class kadanes_Algo_Q_53_leetcode {

	public static void main(String[] args) {
		int[] arr = {-1,1,2,5,4,-4};
		System.out.print(Maximum_sum(arr));
	
	}
	
	
	public static int Maximum_sum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum+= arr[i];
			ans = Math.max(ans,sum);
			if(sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}
	
	public static int Minimum_sum(int[] arr) {
		int ans = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum+= arr[i];
			ans = Math.min(ans,sum);
			if(sum > 0) {
				sum = 0;
			}
		}
		return ans;
	}
}
