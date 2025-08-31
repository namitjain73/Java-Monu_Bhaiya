package Lecture_8;

public class array_rotate_2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        Rotate(arr,k);
        for(int i = 0 ; i < arr.length ; i ++) {
        	System.out.print(arr[i] + "\t");
        }
	}
	public static void Rotate(int[] arr , int k) {
		int n = arr.length;
		k = k  % n ;
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
	}
	
	public static void reverse(int[] arr , int i , int j ) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}
	

}
