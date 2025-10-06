package lecture_51;

public class Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		

	}
	
	public static int LIS(int[] arr) {
		int[] dp = new int[arr.length];
		int len = 1;
		dp[0] = arr[0];
		for(int i = 1 ; i < dp.length ; i++) {
			if(arr[i] > dp[len-1]) {
				dp[len] = arr[i];
				len++;
			}else {
				int idx = BinarySearch(dp , 0 , len - 1 , arr[i]);
				dp[idx]= arr[i];
			}
		}
		return len;
		
	}
	public static int BinarySearch(int[] dp , int lo , int hi , int t) {
		int ans = 0;
		while(lo <= hi) {
			int mid = lo + (hi - lo)  / 2;
			if(dp[mid] >= t) {
				ans = mid;
				hi = mid - 1;
			}else {
				lo = mid + 1;
			}
		}
		return ans;
	}

}
