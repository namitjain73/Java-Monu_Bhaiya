package lecture_49;

public class Distinct_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int Distribution(String s , String t , int i , int j) {
		if(t.length() == j) {
			return 1;
		}
		if(s.length() == i) {
			return 0;
		}
		
		int inc = 0;
		int exc = 0;
		if(s.charAt(i) == t.charAt(j)) {
			inc = Distribution(s , t , i+1 , j+1);
		}
		exc = Distribution(s , t , i+1 , j);
		return inc+exc;
	}

}
