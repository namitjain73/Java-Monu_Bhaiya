package lecture_30;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram_leetcode {
// next/previous greater , next/previous smaller
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,6,2,3};
		int n = largest_histogram(arr);
		System.out.print(n);

	}
	public static int largest_histogram(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for(int i = 0 ; i  < arr.length ; i++) {
			while(!st.empty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
			
				if(st.isEmpty()) {
					ans = Math.max(h * r ,  ans);
				}
				else {
					int l = st.peek();
					int area = h * (r - l - 1);
					ans = Math.max(area,  ans);
				}
			}
			st.push(i);
		}
		int r = arr.length;
		while(!st.empty()) {
			int h = arr[st.pop()];
		 
			if(st.isEmpty()) {
				ans = Math.max(h * r ,  ans);
			}
			else {
				int l = st.pop();
				int area = h * (r - l - 1);
				ans = Math.max(area,  ans);
			}
		}
		
		return ans;
	}

}
