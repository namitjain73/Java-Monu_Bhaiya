package lecture_23;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc";
		per(s,"");
	}
	public static void per(String s , String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
		}
		
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
		 	String s1= s.substring(0,i) + s.substring(i+1);
//			String s2= ;
			per(s1,ans+ch);
		}
	}

}
