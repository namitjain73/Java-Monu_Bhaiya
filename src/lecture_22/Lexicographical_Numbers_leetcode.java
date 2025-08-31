package lecture_22;

public class Lexicographical_Numbers_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		Print(n,0);

	}
	public static void Print(int n ,int curr) {
		if(curr > n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if(curr == 0){
			i = 1;
			
		}
		for(; i <= 9 ; i++) {
			Print(n, curr * 10 + i);
		}
		
	}

}
