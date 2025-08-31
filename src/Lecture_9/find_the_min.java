package Lecture_9;

public class find_the_min {

	public static void main(String[] args) {
		int[] arr = {4,-1,5,3,2,1,7};
		System.out.print(min(arr,2));
		
	}
	public static int min(int[] arr , int k ) {
		int m = k;
		for(int i = k+1 ; i < arr.length ; i++) {
			if(arr[i] < arr[m]) {
				m = i;
			}
			
		}
		return m;
	}

}
