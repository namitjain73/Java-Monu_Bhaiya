package lecture_26;
import java.util.*;
public class N_Queen_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	n = 4;
		boolean[][] board = new boolean[n][n];
		String s = "....";
		List<String> list = new ArrayList<>();
		List<List<String>> ll = new ArrayList<>();
		Print(board,0,n,s,list,ll);
		System.out.print(ll);
		

	}
	
	
	public static void Print(boolean[][] board , int row ,int tq,String s,List<String> list,List<List<String>> ll) {
		if(tq == 0) {
			 ll.add(new ArrayList<>(list));
			return;
		}
		for(int col = 0 ; col < board[0].length ; col++) {
			if(isitsafe(board,row,col)) {
				board[row][col] = true;
//				System.out.println(s);
				s = s.substring(0,col) + "Q" + s.substring(col+1);
				list.add(s);
				s = s.substring(0,col) + "." + s.substring(col+1);
				Print(board,row + 1 , tq - 1,s,list,ll);
				list.remove(list.size()-1);
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
	

}


// ek queen ko cell par bethane ki probabily column ke brarbar hogi