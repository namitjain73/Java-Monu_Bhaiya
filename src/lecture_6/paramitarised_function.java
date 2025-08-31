package lecture_6;

public class paramitarised_function {

	public static void main(String[] args) {
		System.out.println("hello");
		int a = 8;
		int b = 7;
		add(a,b);
		System.out.println("Bye");

	}
	
	public static void add(int a , int b) {
		int c = a + b;
		sub(c,a);
		System.out.println(c);
	}
	
	public static void sub(int a , int b) {
		int c = a - b;
		System.out.println(c);
	}
}
