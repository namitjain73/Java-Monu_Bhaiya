package lecture_22;
import java.util.*;
public class Generate_Parentheses_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> list = new ArrayList<>();
		String ans= "";
		Print(n,ans,0,0,list);
		System.out.println(list);

	}
	public static void Print(int n ,String ans , int open , int close,List<String> list) {
		if(open == n && close == n) {
//			System.out.println(ans);
			list.add(ans);
			return;
		}
//		if(close > open) {
//			return;
//		}
		if(open > n || close > open) {
			return;
		}
		
		Print(n ,ans + "(" , open+1,close,list);
		Print(n,ans + ")" , open , close+1,list);
	}

}
