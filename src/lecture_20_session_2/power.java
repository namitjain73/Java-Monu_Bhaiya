package lecture_20_session_2;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 4;
		System.out.print(pow(a,n));

	}
	
	public static int pow(int a , int n) {
		if(n == 0) {
			return 1;
		}
		
		int fn = pow(a,n - 1);	
		return fn * a;
		
	}

}
