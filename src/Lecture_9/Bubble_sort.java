package Lecture_9;

public class Bubble_sort {

	public static void main(String[] args) {
		 int[] arr = {4,2,5,77,8,1,3,6,5,4,7,8,9,5};
		 int n = arr.length;
		 for(int i = 1 ;i < n ; i++) {
			 for(int j = 0 ; j < (n-i) ; j++) {
				 if(arr[j] > arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
				 
			 }
			 
		 }
		 for(int i = 0 ; i< n ; i++) {
			 System.out.print(arr[i] + " ");
		 }
		
	}

}
