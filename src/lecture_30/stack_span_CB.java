package lecture_30;
import java.util.*; 
public class stack_span_CB {
// next greater element
// sunny building
//	daily temperature
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,5,3,2,8,7,9,11,3,1};
		stackspan(arr);
	}
	
	public static void stackspan(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for(int i = 0 ; i  < arr.length ; i++) {
			while(!st.empty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				ans[i] = i + 1;
			}
			else {
				ans[i] = i - st.peek();
			}
			st.push(i);
		}
		
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
