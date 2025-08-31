package lecture_19;

public class leetcode_713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,2,6,3,4,6};
		int k = 10;
		System.out.println(Product_less_Than_k(arr,k));
		

	}
	public static int Product_less_Than_k(int[] arr , int k) {
		int ans = 0  , si = 0,ei=0,p = 1;
		while(ei < arr.length) {
//			grow
			p = p * arr[ei];
			
//			shrink
			
			while(p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}
			
//			ans update
			ans =ans + ei - si + 1;
		    ei++;
		}
		return ans;
	}

}
