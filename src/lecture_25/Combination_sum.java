package lecture_25;
import java.util.*;
public class Combination_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2,3,6,7};
		int target = 7;
		List<List<Integer>> ll2 = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		combination(coin,target,ll,0,ll2);
		System.out.println(ll2);
	}
	
	public static void combination(int[] coin, int amount , List<Integer> ll, int idx,List<List<Integer>> ll2) {
		if(amount == 0) {
			ll2.add(new ArrayList<>(ll));
			return ;
		}
		for(int i = idx ; i < coin.length ; i++) {
			if(amount >= coin[i]) {
				ll.add(coin[i]);
				combination(coin,amount - coin[i] , ll, i,ll2);
				ll.remove(ll.size()-1);
			}
		}
	}

}
