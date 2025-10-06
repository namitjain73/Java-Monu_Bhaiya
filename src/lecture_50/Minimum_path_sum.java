package lecture_50;

public class Minimum_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};

	}
	
	public static int Minimum_Path(int[][] grid, int cr , int cc , int[][] dp) {
		if(cc == grid.length-1 && cc ==grid[0].length-1) {
			return grid[cr][cc];
		}
		if(cc == grid[0].length || cr == grid.length) {
			return Integer.MAX_VALUE;
		}
		if(dp[cr][cc] != -1) return dp[cr][cc];
		
		int d = Minimum_Path(grid,cr+ 1 , cc,dp);
		int r = Minimum_Path(grid, cr , cc+1,dp);
		
		
		return Math.min(d, r)+grid[cr][cc];
	}

}
