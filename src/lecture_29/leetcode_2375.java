package lecture_29;
import java.util.Stack;
public class leetcode_2375 {
	public static void main(String[] args) {
		String str = "IIIDIDDD";
		String s = Construct_Smallest_Number(str);
		System.out.println(s);
	}
	
	public static String Construct_Smallest_Number(String str) {
		int[] ans = new int[str.length() + 1];
		int c = 1;
		Stack<Integer> st = new Stack<>();
		for(int i = 0  ; i <= str.length(); i++) {
			if(i == str.length() || str.charAt(i) == 'I') {
				ans[i] = c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()] = c;
					c++;
				}
				
			}
			
			else {
				st.push(i);
			}
		}
		
		String s = "";
		for(int v : ans) {
			s += v;
		}
		return s;
	}

}
