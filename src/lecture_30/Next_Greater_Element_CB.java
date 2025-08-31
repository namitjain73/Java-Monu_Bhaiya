package lecture_30;
import java.util.Stack;
public class Next_Greater_Element_CB {
// in this question monotonic stack are used
//	monotonic stack are store data in strictly increasing or decreasing order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,5,3,2,8,7,9,11,3,1};
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			while(!st.empty() && arr[i] < arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while(!st.empty()) {
			ans[st.pop()] = -1; 
		}
		
		for(int i = 0 ; i < ans.length ; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
