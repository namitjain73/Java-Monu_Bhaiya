package lecture_24;

public class coin_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5};
		int n = 5;
		count_coin(arr,n,"");
		

	}
	public static void count_coin(int[] coin , int amount , String ans) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}

		
		for(int i = 0 ; i < coin.length ; i++) {
			if(amount >= coin[i]) {
				count_coin(coin,amount-coin[i],ans+coin[i]);
			}
			
		}
		return;
	}

}
