package lecture_27;

public class Partition_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[ .. < last element | Last element | .. > last element]
		int[] arr = {5,7,2,1,8,3,4};
		int n = Partition(arr,0,6);
		System.out.println(n);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static int Partition(int[] arr ,int si , int ei) {
		int item = arr[ei];
		int idx = si;
		for(int i = si ; i < ei ; i++) {
			if(arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx] ; 
				arr[idx] = temp ;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx] ; 
		arr[idx] = temp ;
		return idx;
	}

}
