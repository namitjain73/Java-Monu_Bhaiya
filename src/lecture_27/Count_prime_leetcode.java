package lecture_27;

public class Count_prime_leetcode {

	public static void main(String[] args) {
		int n = 71;
		System.out.println(isprime(n));
	}
	
	public static boolean isprime(int n) {
		int div  = 2;
		while(div * div <= n) {
			if(n % div== 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
