package lecture_52;

import java.util.Arrays;

public class Optimal_Game_Strategy_2 {
//	https://codeskiller.codingblocks.com/problems/1255
//	486 leetcode 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,4};
		int[][] dp = new int[arr.length+1][arr.length+1];
		for(int[] d : dp) {
			Arrays.fill(d,-1);
		}
		System.out.println(helper(arr,0,arr.length-1,dp));
		

	}
	
	public static int helper(int[] arr, int i , int j,int[][] dp) {
		if(i > j) return 0;
		if(dp[i][j] != -1)return dp[i][j];
				
				
		int fs = arr[i] + Math.min(helper(arr , i+2 , j,dp), helper(arr , i+1 , j-1,dp));
		int ss = arr[j] + Math.min(helper(arr , i+1 , j-1,dp), helper(arr , i , j - 2,dp));
		int ans = Math.max(fs, ss);
		return dp[i][j] = ans;
		
	}

}
