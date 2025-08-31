package lecture_12;

public class Transpose_arr {

	public static void main(String[] args) {
		int[][] arr = {{1,2,7,11,15},
				       {2,5,8,12,19},
				       {3,6,9,16,22},
				       {10,13,14,17,24},
				       {18,21,23,26,30}};  
		Display(arr);
		int n = arr.length;
		int m = arr[0].length;
		Transpose(arr);
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				System.out.print(arr[i][j] + " ");
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
	
	
	public static void Transpose(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < m ; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
	}

}
