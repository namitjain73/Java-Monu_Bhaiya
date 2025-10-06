package lecture_51;

import java.util.Arrays;

public class Wine_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = {2,3,5,1,4};
		int[][] dp = new int[wine.length+1][wine.length+1];
		for(int[] d: dp) {
			Arrays.fill(d, -1);;
		}
		System.out.println(maximum_profit(wine,0,wine.length-1,1,dp));
		System.out.println(maximum_profit_BU(wine));
	}
	public static int maximum_profit(int[] wine , int i , int j , int year,int[][] dp) {
		if(i > j) return 0;
		int fs = wine[i]* year + maximum_profit(wine , i + 1 , j , year +1,dp);
		int ls = wine[j] * year + maximum_profit(wine, i , j-1 , year + 1,dp);
		return Math.max(fs ,  ls);
		
	}
	
	public static int maximum_profit_BU(int[] wine) {
		 int[][] dp = new int[wine.length][wine.length];
		 int year = wine.length;
		 for(int i = 0 ; i < dp.length ; i++) {
			 dp[i][i] = wine[i] * year; 
		 }
		 year--;
		 for(int gap = 1 ; gap < dp.length ; gap++) {
			 for(int j = gap ; j < dp.length ; j++) {
				 int i = j - gap;
				 int fs = wine[i] * year + dp[i+1][j];
				 int ls = wine[j] * year + dp[i][j-1];
				 dp[i][j] = Math.max(fs, ls);
			 }
			 year--;
		 }
		 
		 return dp[0][dp.length-1];
	}

}
