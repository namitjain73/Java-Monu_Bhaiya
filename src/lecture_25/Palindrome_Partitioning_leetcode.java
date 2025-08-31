package lecture_25;
import java.util.*;
public class Palindrome_Partitioning_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> ans = new ArrayList<>();
		List<String> ll = new ArrayList<>();
		String s= "nitin";
		partitioning(s,ll,ans);
		System.out.println(ans);

	}
	
	public static void partitioning(String ques,List<String> ll , List<List<String>> ans) {
		if(ques.length() == 0) {
			ans.add(new ArrayList<String>(ll));
			return;
		}
		
		
		for(int cut = 1 ; cut <= ques.length(); cut++) {
			String s = ques.substring(0,cut);
			if(plindrom(s)) {
				ll.add(s);
				partitioning(ques.substring(cut) , ll,ans);
				ll.remove(ll.size()-1);
			}
		}
		
	}
	public static boolean  plindrom(String s) {
		int lo = 0 ;
		 int hi = s.length()-1;
		 while(lo < hi) {
			 if(s.charAt(lo) != s.charAt(hi)) {
				 return false;
			 }
			 lo++;
			 hi--;
		 }
		 return true;
	}

}
