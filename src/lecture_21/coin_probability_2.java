
package lecture_21;

public class coin_probability_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		String ans= "";
		cointoss(n,ans);

	}
	public static void cointoss(int n , String ans) {
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		if(ans.length()== 0 || ans.charAt(ans.length()-1) != 'H') {
			cointoss(n-1,ans+"H");
		}
		cointoss(n-1,ans+"T");
		
	}

}
