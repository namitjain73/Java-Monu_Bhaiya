package lecture_12;
import java.util.*;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3;
		int col = 4;
		int[][] arr = new  int[row][col];
		System.out.println(arr);
		System.out.println(arr[1]);
//		length of row
		System.out.println(arr.length);
//		length of column
		System.out.println(arr[0].length);
//		System.out.println(arr[0][0].length);
		
		
		
		int r = 0;
		int c = 0;
		System.out.println("give the size of arr");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c= sc.nextInt();
		for(int i = 0 ; i < r ; i++) {
			for(int j  = 0;  j < c ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Display(arr);
		

	}
	
	public static void Display(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j  = 0;  j < arr[0].length ; j++) {
				System.out.print(arr[i][j]);;
			}
			System.out.println();
		}

	}

}
 