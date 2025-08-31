package lecture_21;

public class find_the_probability_of_n_coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		String ans ="";
		cointoss(n,ans);

	}
	public static void cointoss(int n , String ans) {
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		cointoss(n-1,ans+"H");
		cointoss(n-1,ans+"T");
		
	}

}
