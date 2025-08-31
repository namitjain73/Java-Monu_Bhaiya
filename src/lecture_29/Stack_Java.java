package lecture_29;
import java.util.Stack;
public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
// stacks ki default capacity 10 hota hai
//		stacks is work on lifo ;- last in first out
//		ex browser
		st.push(10); // to add the items in stack
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		st.push(1000);
		st.push(100);
		st.push(10); // to add the items in stack
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		st.push(1000);
		st.push(100);
		
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.capacity());
	}

}
// vecture 2x se grow krta hai

// difference between vector and arraylist
// vector  synchronized hota hai
// arraylist synchronized nahi hota hai
// 
