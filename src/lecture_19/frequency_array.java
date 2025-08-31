package lecture_19;
import java.util.*;
public class frequency_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rcdfvgbnjmkoploinbgfcdxsxghaaaaaaaaaanjkopijhbgfdghgjgfds";
		char[] ch = s.toCharArray();
		int [] arr = new int[26];
		for(int i = 0 ; i < ch.length ;i ++) {
			arr[ch[i]-'a'] ++;
		}
		for(int i = 0 ; i < 26 ;i ++) {
			System.out.print(arr[i]);
		}
		
		

	}

}
