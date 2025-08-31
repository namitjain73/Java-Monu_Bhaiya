package lecture_6;

public class function_q {
	static int val = 100;
	public static void main(String[] args) {
				System.out.println("hello");
				int a = 8;
				int b = 7;
				System.out.println(val);
				System.out.println(add(a,b));
				System.out.println(val);
				System.out.println("Bye");

			}
			
			public static int add(int a , int b) {
				int c = a + b;
//				it is work as a local variable
//				int val = 90;
//				how to use global varible when a local varible is present
				function_q.val = function_q.val  - 5;
				val = val -5;
				return c +sub(c,a);
			}
			
			public static int sub(int a , int b) {
				int c = a - b;
				return c;
			}
	}

