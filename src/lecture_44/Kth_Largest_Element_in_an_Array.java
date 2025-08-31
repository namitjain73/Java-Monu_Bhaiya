package lecture_44;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,5,6,4};
		int k = 4;
		
	}
	
	public int findKthLargest(int[] arr, int k) {
        
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i = 0 ; i < k ; i++) {
			pq.add(arr[i]);
		}
		for(int i = k ; i < arr.length ; i++) {
			if(arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
    }

}
