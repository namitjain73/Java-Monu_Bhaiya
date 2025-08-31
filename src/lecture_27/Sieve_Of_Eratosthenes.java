package lecture_27;

public class Sieve_Of_Eratosthenes {
// or prime sieve algo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		System.out.print(PrimeSieve(n));

	}
//	jis index par zero hai us number ko prime number bolenge
//	see the time complexity in pdf
//	N (log(log(N))  with base of 2
	public static int PrimeSieve(int n) {
		int[] ans = new int[n];
		ans[0] = ans[1] = 1;
		for(int i = 2 ; i * i <= ans.length ; i++) {
			if(ans[i] == 0) {// i prime hai
				for(int j = 2 ; i * j < ans.length ; j++) {
					ans[i * j] = 1;
				}
				
			}
		}
		int c = 0;
		for(int i = 2 ; i < ans.length ; i++) {
			if(ans[i] == 0) {
				c++;
			}
		}
		return c;
	}

}
