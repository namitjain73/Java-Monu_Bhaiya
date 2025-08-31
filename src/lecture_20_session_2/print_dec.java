package lecture_20_session_2;

public class print_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pd(n);
		

	}
	// in this Q. ans give in it's growing state
	// it iis tail recursion
	public static void pd(int n) {
//		if(n == 0) {
//			return;
//		}
//		System.out.println(n);
//		pd(n-1);
		System.out.println(n);
		if(n > 1) {
			pd(n-1);
		}
		
		
	}

}
