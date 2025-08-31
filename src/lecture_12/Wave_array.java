package lecture_12;

public class Wave_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		Display(arr);
		int n = arr.length;
		int m = arr[0].length;
		for(int j = 0 ; j < m ; j++) {
			if(j % 2  == 0) {
				for(int i = 0 ; i < n ;i++) {
					System.out.print(arr[i][j]  + " ");
					
				}
				
			}
			
			else{
				for(int i = n-1 ; i >= 0 ;i--) {
					System.out.print(arr[i][j] + " ");
					
				}
				
			}
		}
		

	}
	
	
	public static void Display(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j  = 0;  j < arr[0].length ; j++) {
				System.out.print(arr[i][j] + " ");;
			}
			System.out.println();
		}

	}

}
