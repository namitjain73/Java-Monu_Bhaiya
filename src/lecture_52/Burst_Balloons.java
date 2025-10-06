package lecture_52;

import java.util.Arrays;

public class Burst_Balloons {
//	https://codeskiller.codingblocks.com/problems/1255
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,5,8};
		int[] arr1 = new int[arr.length+2];
		for(int i = 0 ; i < arr.length ; i++) {
			arr1[i+1] = arr[i];
		}
		arr1[0] = 1;
		arr1[arr1.length-1] =1;
		int[][] dp = new int[arr1.length+1][arr1.length+1];
		for(int[] d : dp) {
			Arrays.fill(d, -1);
		}
		System.out.println(helper(arr1 , 0 , arr1.length-1,dp));

	}
	
	public static int helper(int[] arr , int i , int j , int[][] dp) {
		if(i+1 == j) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		int ans = Integer.MIN_VALUE;
		for(int k = i+1 ; k < j ; k++) {
			int fs = helper(arr,i,k,dp);
			int ss = helper(arr,k,j,dp);
			int self = arr[i] * arr[j] * arr[k];
			ans = Math.max(ans, fs+ss+self);
		}
		return dp[i][j] = ans;
	}

}
