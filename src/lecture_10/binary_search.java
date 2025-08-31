package lecture_10;
// binary search is apply in all sorted array

public class binary_search {

	public static void main(String[] args) {
		int[] arr = {2,3,5,7,9,11,13,14,15,17,18,19,20};
		int item = 13;
		System.out.print(Search(arr,item));
		
		
	}
	
	public static int Search(int[] arr , int item) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo < hi) {
			int mid = (int)(lo+hi)/2;
			if(arr[mid] == item) {
				return mid;
				
			}
			else if(arr[mid] > item) {
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
			
		}
		return -1;
	}

}
