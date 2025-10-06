package lecture_49;

import java.util.Arrays;
//1035
// 518
// 115
//spoj :- edit distance
public class Longest_common_subsequence_bottom_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int ans = 0;
        for(int i = 1 ; i < dp.length ; i++) {
        	for(int j = 1 ; j < dp[0].length ; j++) {
        		if(s1.charAt(i-1) == s2.charAt(j-1)){
                    ans = 1 + dp[i-1][j-1];
                }else{
                    int l = dp[i-1][j];
                    int r = dp[i][j-1];
                    ans = Math.max(l,r);
                }
        		dp[i][j] = ans;
        		
        	}
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }

}
