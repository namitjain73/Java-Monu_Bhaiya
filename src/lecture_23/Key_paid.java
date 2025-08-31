package lecture_23;

public class Key_paid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ques = "23";
		Print(ques,"");

	}
	public static void Print(String ques,String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
	    String getString = key[ch - '0'];
	    for(int i = 0 ; i < getString.length() ; i++) {
	    	Print(ques.substring(1),ans + getString.charAt(i));
	    }
	}

}
