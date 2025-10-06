package lecture_50;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(minFallingPathSum(arr));

	}
	public static int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(dp[i],-66666);
        }
        for(int i = 0 ; i < m ; i++){
            ans = Math.min(ans,helper(grid,0,i,dp));
        }
        return ans;
    }
    public static int helper(int[][] grid , int cr , int cc , int[][] dp){
        if(cr == grid.length-1) return grid[cr][cc];
        if(dp[cr][cc] != -66666) return dp[cr][cc];

        int ans = Integer.MAX_VALUE;        
        for(int i = 0 ; i < grid[0].length ; i++){
            if(i == cc) continue;
            ans = Math.min(ans,helper(grid,cr+1,i,dp));
            
        }

        return dp[cr][cc] = ans + grid[cr][cc];
    }

}
