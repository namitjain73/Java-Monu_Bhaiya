package lecture_29;

import java.util.Stack;

public class stacks_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10); // to add the items in stack
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
		

	}
	
	public static void reverse(Stack<Integer> st) {
		if(st.size() == 0) {
			return;
		}
		int m = st.pop();
		
		Add_Last(st,m);
		reverse(st);
		
	}
	public static void Add_Last(Stack<Integer> st , int n) {
		if(st.size() == 0) {
			st.push(n);
			return;
		}
		
		int m = st.pop();
		Add_Last(st,n);
		st.push(m);
	}

}
