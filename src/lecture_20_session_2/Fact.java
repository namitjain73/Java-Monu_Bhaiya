package lecture_20_session_2;

public class Fact {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.print(factorial(n));		
	}
//	around near about 10's power 4 or 5 number of call stacks will be provide at a time
	// it is head recursion
	public static int factorial(int n ) {
		if(n == 0) {
			return 1;
		}
//		int fn = factorial(n-1);
//		return fn*n;
		return factorial(n-1)*n;
		
	}

}
