package Lecture_7;

public class array_swap {
	public static void main(String[] args) {
		int[] arr = {2,5,4,8,6,5};
		int [] other = {31,51,11,71,81};
		System.out.print(arr[0] +" " + other[0]);
		swap(arr,other);
		System.out.print(" "+ arr[0] +" " + other[0]);
	}
	public static void swap(int [] arr, int[] other){
		int[] temp = arr;
		arr = other;
		other = temp;
		
	}

}
