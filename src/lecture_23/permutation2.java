package lecture_23;

public class permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "112";
		per(s,"");
	}
	
	
	
	public static boolean isvalid(String str , int i , char ch) {
		for(int j = i ; j < str.length() ; j++) {
			if(str.charAt(j) == ch) {
				return true;
			}
			
		}
		return false;
	}
	public static void per(String s , String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
		}
		
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
			if(!isvalid(s,i+1,ch)){
			String s1= s.substring(0,i);
			String s2= s.substring(i+1);
			per(s1+s2,ans+ch);
			}
		}
	}

}

// arraylist
