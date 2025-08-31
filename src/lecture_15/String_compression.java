package lecture_15;

public class String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "monl";
		String s2 = "mo";
		System.out.println(s1.compareTo(s2));
		String s3 = "ankit";
		String s4 = "ankitaaa";
		System.out.println(compareTo(s3,s4));

	}
	public static int compareTo(String s1,String s2) {
		if(s1 == s2) {
			return 0;
		}
		int n = Math.min(s1.length(), s2.length());
		for(int i = 0; i < n ; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		
		return s1.length()-s2.length();
//		else if(s1.length() != s2.length()) {
//			return  -1;
//		}
//		else {
//			for(int i = 0 ; i < s1.length() ; i++) {
//				int a = s1.charAt()
//				if()
//			}
//		}
		
	}
}
