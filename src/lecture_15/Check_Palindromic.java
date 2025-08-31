package lecture_15;

public class Check_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "nitn";
		System.out.println(IsPlindrom(s1));
		

	}
	public static boolean IsPlindrom(String s) {
		int i = 0;
		int j = s.length();
		while(i < j) {
			if(s.charAt(i) != s.charAt(i)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
