package lecture_22;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Print(n,0,"");
		

	}
	public static void Print(int n , int curr , String ans) {
		if(curr == n) {
			System.out.println(ans);
			return;
			}
		if(curr > n) {
			return;
		}
//		Print(n,curr+1,ans+1);
//		Print(n,curr+2,ans+2);
//		Print(n,curr+3,ans+3);
		for(int dice = 1 ;dice <= 3 ; dice++) {
			Print(n, curr + dice ,ans + dice);
		}
		
		
	}

}
