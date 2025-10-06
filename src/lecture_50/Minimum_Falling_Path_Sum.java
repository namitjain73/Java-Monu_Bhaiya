package lecture_50;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
		System.out.println(minFallingPathSum(grid));
	}
	
	public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(dp[i],-66666);
        }
        for(int i = 0 ; i < m ; i++){
            ans = Math.min(ans,helper(matrix,0,i,dp));
        }
        return ans;        
    }
    public static int helper(int[][] grid , int i , int j , int[][] dp){
        if(j < 0 || j >= grid[0].length){
            return Integer.MAX_VALUE;
        }

        if(i == grid.length-1) return grid[i][j];
        if(dp[i][j] != -66666) return dp[i][j]; 

        int Dright = helper(grid,i+1,j-1,dp);
        int down = helper(grid,i+1,j,dp);
        int Dleft = helper(grid,i+1,j+1,dp);

        return dp[i][j] = Math.min(Dright,Math.min(down,Dleft))+ grid[i][j];
    }

}
