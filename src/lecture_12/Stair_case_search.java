package lecture_12;

public class Stair_case_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			    {1, 4, 7, 11},
			    {2, 5, 8, 12},
			    {3, 6, 9, 16},
			    {10, 13, 14, 17}
			};
		int t = 13;
		System.out.print(Search(arr,t));

	}
	
	public static boolean Search(int[][] arr , int t) {
		int r =0;
		int c = arr[0].length-1;
		while(r < arr.length && c >= 0) {
			if(arr[r][c] == t) {
				return true;
				
			}
			else if(arr[r][c] > t) {
				c--;
			}
			else if(arr[r][c] < t) {
				r++;
				
			}
		}
		return false;
		
	}

}
