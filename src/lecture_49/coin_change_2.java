package lecture_49;

public class coin_change_2 {
	
	public static void main(String[] args) {
		int amt = 5;
		int[] arr = {1,2,3,4};
		int[][] dp= new int[amt+1][arr.length];
		System.out.println();
	}
	
	public static int Coin_Change(int[] coin , int amount , int i,int[][] dp) {
		if(amount == 0) {
			return 1;
		}
		if(i == coin.length) {
			return 0;
		}
		if(dp[amount][i] != -1) return dp[amount][i];
		
		int inc = 0;
		int exc = 0;
		if(amount >= coin[i]) {
			inc = Coin_Change(coin, amount-coin[i],i,dp);
		}
		exc = Coin_Change(coin,amount,i+1,dp);
		return dp[amount][i] = inc+exc;
	}

}
