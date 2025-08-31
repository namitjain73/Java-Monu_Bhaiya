package lecture_20_session_2;

public class First_Occ_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4,6,4,3,7};
		int item = 4;
		System.out.print(index(arr, item , 0));
		

	}
	// recursion are two type 1. head recursion, 2. tail recursion
	// tail recursion is best
	public static int index(int [] arr ,int item,int i) {
		if(i == arr.length) {
			return -1;
		}
		if(item == arr[i]) {
			return i;
		}
		return index(arr , item,i+1);
		
	}

}
