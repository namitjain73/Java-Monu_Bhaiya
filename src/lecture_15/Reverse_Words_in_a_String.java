package lecture_15;

import java.util.Arrays;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "     the sky is       blue        ";
		String s = "A man, a plan,              a canal: Panama";
		s = s.trim();
		System.out.println(s);
		String[] arr = s.split("\s+");
		s = Arrays.toString(arr);
		arr = s.split(":");
		
		System.out.println(Arrays.toString(arr));
// frequency array		

	}

}
