package lecture_27;

public class Merge_sort {
// divide and conquer (D&C) algo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,3,4,2};
		int[] arr1 = sort(arr , 0 , 4);
		for(int i = 0 ;  i < arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
		

	}
	public static int[] sort(int [] arr , int si , int ei) {
		if(si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + ei )/ 2;
		int[] a = sort(arr , si , mid);
		int[] b = sort(arr , mid+1 , ei);
		return Merge_Two_Array(a,b);
	}
	
	public static int[] Merge_Two_Array(int[] arr1 , int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0 , j = 0 , k = 0;
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			}
			else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while(j < m) {
			ans[k] = arr2[j];
			k++;
			j++;
		}
		return ans;
	}
}
