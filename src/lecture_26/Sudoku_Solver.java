package lecture_26;

public class Sudoku_Solver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {
			    {8, 3, 0, 0, 7, 0, 0, 0, 0},
			    {6, 0, 0, 1, 9, 5, 0, 0, 0},
			    {0, 9, 8, 0, 0, 0, 0, 6, 0},
			    {8, 0, 0, 0, 6, 0, 0, 0, 3},
			    {4, 0, 0, 8, 0, 3, 0, 0, 1},
			    {7, 0, 0, 0, 2, 0, 0, 0, 6},
			    {0, 6, 0, 0, 0, 0, 2, 8, 0},
			    {0, 0, 0, 4, 1, 9, 0, 0, 5},
			    {0, 0, 0, 0, 8, 0, 0, 7, 9}
			};
		if (Print(grid, 0, 0)) {
			Display(grid);  // Show the final result only if solved
		} else {
			System.out.println("No solution exists.");
		}

	}

	public static void Display(int[][] grid) {
		for(int i =  0 ; i  < grid.length ; i++) {
			for(int j = 0 ; j < grid[0].length ; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean Print(int[][] grid , int row , int col) {
		
		if(col == 9) {
			row++;
			col = 0;
		}
		
		if(row == 9) {
//			Display(grid);
			return true;
		}
		if(grid[row][col]!=0) {
			return Print(grid , row , col  + 1);
		}
		
		else {
			for(int val = 1 ; val <= 9 ; val++) {
				if(isitsafe(grid,row,col,val)) {
					grid[row][col] = val;
					boolean ans = Print(grid,row,col+1);
					if(ans) {
						return true;
					}
					grid[row][col] = 0;
				}
			}
		}
		return false;
	}
	
	public static boolean isitsafe(int[][] grid , int row , int col , int val) {
//		col
		for(int i = 0 ; i < 9 ; i++) {
			if(grid[row][i] == val) {
				return false;
			}
		}
//		row 
		for(int i = 0 ; i < 9 ; i++) {
			if(grid[i][col] == val) {
				return false;
			}
		}
//		3*3 matrix
		int r = row - row % 3;
		int c = col - col % 3;
		for(int i = r ; i < r + 3 ; i++) {
			for(int j = c ; j < c + 3 ; j++) {
				if(grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;
		
	}

}
