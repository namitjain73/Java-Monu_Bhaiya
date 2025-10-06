package lecture_49;

public class Spoj_Edit_Distance_EDIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Food";
		String t = "Money";
		

	}
	public static int helper(String s  , String t , int i , int j) {
		 if(i == s.length()) {
			 return t.length();
		 }
		 if(j == t.length()) {
			 return s.length()-i;
		 }
		
		int x = 0;
		int y = 0;
		int z = 0;
		int ans = 0;
		if(s.charAt(i) == t.charAt(j)) {
			ans = 1 + helper(s,t,i+1,j+1);
			
		}else {
			x = helper(s,t,i+1,j);
			y = helper(s,t,i+1,j+1);
			z = helper(s,t,i,j+1);
			ans = Math.min(y, Math.min(z, x));
		}
		
		
		return ans;
		
	}

}
