package lecture_47;

import java.util.Arrays;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int[]  dp = new int[i+1];
		Arrays.fill(dp,-1);
		int n =fiboTD(i,dp);
		System.out.println(n);
		System.out.println(fiboBU(i));
	}
//	so tc is n
	
	public static int fiboTD(int n , int[] dp) {
		if(n == 0 || n == 1) {
			return n;
		}
		if(dp[n] != -1) return dp[n];
		int f1 = fiboTD(n-1 , dp);
		int f2 = fiboTD(n -2 ,dp);
		return dp[n] = f1 + f2;
	}
	
	public static int fiboBU(int n) {

		int[] arr = new int[n+1];
		for(int i = 2 ; i < n+1 ; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}

}
