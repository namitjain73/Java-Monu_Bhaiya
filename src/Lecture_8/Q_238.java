package Lecture_8;

public class Q_238 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int arr2[] = mo(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr2[i]);
		}
// prefix and suffix approach		

	}
	public static int[] mo(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 1;
		for(int i = 1 ; i < n ; i++) {
			left[i] = left[i-1]*arr[i-1];
			
		}
		right[n-1] = 1;
		for(int i = n - 2 ; i >= 0 ; i--) {
			right[i] = right[i+1]*arr[i+1];
			
		}
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println(left[i] + " " + right[i]);
			left[i] = left[i]*right[i];
			
		}
		return left;
		
		
		
	}

}
