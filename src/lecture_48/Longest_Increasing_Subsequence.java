package lecture_48;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
//when we talk about strictly increasing then it is always variation if lis
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(arr));

	}
	public static int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 0 ; i < n ; i++){
            for(int j = i - 1 ; j >= 0 ; j--){
                if(arr[i] > arr[j]){
                    int x = dp[j];
                    dp[i] = Math.max(dp[i],x+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }

}
