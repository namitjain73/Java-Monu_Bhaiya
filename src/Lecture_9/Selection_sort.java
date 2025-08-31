package Lecture_9;

public class Selection_sort {

	public static void main(String[] args) {
		int[] arr = {4,-1,5,3,2,1,7};
			sort(arr);
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
			
		
	}
// it is the best approach	
	public static int min_ind(int[] arr , int k ) {
		int m = k;
		for(int i = k+1 ; i < arr.length ; i++) {
			if(arr[i] < arr[m]) {
				m = i;
			}
			
		}
		return m;
	}
	
	
	public static void sort(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			int index = min_ind(arr,i);
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
	}

}
