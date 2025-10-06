package lecture_52;

import java.util.Arrays;
//done wit BU also
// diagonal 
//3 loop n^3
public class MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,3,5,1};
		int[][] dp = new int[arr.length+1][arr.length+1];
		for(int[] i : dp) {
			Arrays.fill(i, -1);
		}
		System.out.println(mcm(arr,0,arr.length-1,dp));

	}

	private static int mcm(int[] arr, int i, int j ,int[][] dp) {
		if(i+1 == j) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		int ans= Integer.MAX_VALUE;
		for(int k = i+1 ; k< j ; k++) {
			int fs = mcm(arr,i,k,dp);
			int ss = mcm(arr,k,j,dp);
			int self= arr[i]*arr[k]*arr[j];
			ans = Math.min(fs+ss+self,ans);
		}
		
		return dp[i][j] = ans;
	}

}
