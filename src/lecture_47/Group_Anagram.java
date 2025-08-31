package lecture_47;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Group_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		group_Anagram(arr);
	
	}

	private static void group_Anagram(String[] arr) {
		// TODO Auto-generated method stub
		HashMap<String,List<String>> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) {
			String key = GetKey(arr[i]);
			if(!map.containsKey(key)) {
				map.put(key,new ArrayList<>());
			}
			map.get(key).add(arr[i]);
		}
		
		List<List<String>> ll = new ArrayList<>();
		for(String key : )
		
	}
	public static String GetKey(String s) {
		int[] freq= new int[26];
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			freq
		}
	}

}
