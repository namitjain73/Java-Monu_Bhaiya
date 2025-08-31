package lecture_20_session_2;

public class print_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pi(n);
		

	}
	// in this Q. ans give in it's shrink state
	public static void pi(int n) {
//		if(n == 0) {
//			return;
//		}
//		pi(n-1);
//		System.out.println(n);
		
		if(n > 1) {
			pi(n-1);
		}
		System.out.println(n);
		
		
	}

}
