package Lecture_8;

public class Moore_voting_Q_169 {

	public static void main(String[] args) {
		int[] arr  = {2,2,2,2,2,5,4,6,7};
		System.out.print(Moore_Voting(arr));

	}
	
	
	public static int  Moore_Voting(int[] arr) {
		int e =arr[0];
		int v = 1;
		for(int i = 1; i < arr.length ; i++) {
			if(arr[i] == e) {
				v++;
			}
			else {
				v--;
				if(v == 0) {
					e = arr[i];
					v = 1;
				}
			}
		}
		return e;
	}

}
