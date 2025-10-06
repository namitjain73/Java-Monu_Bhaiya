package lecture_48;

import java.util.Arrays;

public class House_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1};
		System.out.println(recrob(arr));
		System.out.println(tabrob(arr));

	}
	
	
	private static int tabrob(int[] arr) {
		int n = arr.length;
		int[] dp = new int[arr.length+1];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0],arr[1]);
		for(int i = 2; i < arr.length ; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+ arr[i]);
		}
		return dp[n-1];
	}


	public static int recrob(int[] nums) {
	    int[] dp = new int[nums.length+1];
	    Arrays.fill(dp,-1);
	    return helper(nums,0,dp);
	    }
	    public static int helper(int[] arr , int i, int[] dp){
	        if(i > arr.length-1) return 0;
	        if(dp[i] != -1) return dp[i];

	        int inc = helper(arr,i+2,dp)+arr[i];
	        int ex = helper(arr,i+1,dp);
	        return dp[i] = Math.max(inc,ex);

	    }

}