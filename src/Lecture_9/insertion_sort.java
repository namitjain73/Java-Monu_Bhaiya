package Lecture_9;

public class insertion_sort {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] arr = {1,2,7,9,8,11,4};
		sort(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

		
		
	}
	
//	log ap gp hp dekhna hai
	public static void sort(int[] arr) {
		for(int i = 1 ; i < arr.length ; i++) {
			insertLastElement(arr,i);
		}
		
	}
	
	
	public static void insertLastElement(int[] arr , int i) {
		int item = arr[i];
		int j = i - 1;
		while(j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}
//		return j + 1;
		
	}

}
