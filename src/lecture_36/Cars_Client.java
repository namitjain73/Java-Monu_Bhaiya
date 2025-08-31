package lecture_36;

import java.util.*;
import java.util.Comparator;

public class Cars_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black"); // P S C
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
//		Arrays.sort(arr); //error
//		Sort(arr);
		Arrays.sort(arr , new Comparator<Cars>() {
			@Override
			public int compare(Cars o1 , Cars o2) {
				return o1.price - o2.price;
			}
		});
		display(arr);
		
	}
	
	public static void display(Cars[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
//	arr[i] and arr[i+1] has the address . and the address's are not 
// we can't sorting by .price because we don;t know what is the datatype i[of the array
//	ek esa vesa koi bhi array nahi aayega jiske pass comprable ka logic na ho(Bound set karna)
	
 	public static <T extends Comparable<T>> void Sort(T[] arr) {
		 int n = arr.length;
		 for(int i = 1 ;i < n ; i++) {
			 for(int j = 0 ; j < (n-i) ; j++) {
//				arr[j] ki value this par jaegi or arr[j+1] ki value o par jaegi
				 if(arr[j].compareTo(arr[j+1]) > 0) {
					 T temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
				 
			 }
			 
		 }
//		 for(int i = 0 ; i< n ; i++) {
//			 System.out.print(arr[i] + " ");
//		 }
		
	}

}