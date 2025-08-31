package lecture_26;
import java.util.*;
public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	n = 5;
		boolean[][] board = new boolean[n][n];
		Print(board,0,n);
		

	}
	
	
	public static void Print(boolean[][] board , int row ,int tq) {
		if(tq == 0) {
			 Display(board);
			return;
		}
		for(int col = 0 ; col < board[0].length ; col++) {
			if(isitsafe(board,row,col)) {
				board[row][col] = true;
				Print(board,row + 1 , tq - 1);
//				arr me kabhi bhi value automatic undo nai hoti use manually karna padta hai
				board[row][col] = false;
			}
		}
		
	}
	
	public static boolean isitsafe(boolean[][] board , int row , int col){
		int r = row;
//		upside
		while(r >= 0) {
			if(board[r][col]) {
				return false;
			}
			r--;
		}
//		diagonal right
		
		r = row;
		int c = col;
		while(r >= 0 && c < board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		
//		diagonal left
		r = row;
		c = col;
		while(r >= 0 && c >= 0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		return true;
		
	}
	
	public static void Display(boolean[][] ans) {
		for(int i = 0 ; i < ans.length ; i++) {
			for(int j =0 ; j < ans.length ; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		return;
	}

}


// ek queen ko cell par bethane ki probabily column ke brarbar hogi