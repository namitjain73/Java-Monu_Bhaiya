package lecture_22;

public class Count_Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.print(Print(n,0,""));
		

	}
	public static int Print(int n , int curr , String ans) {
		if(curr == n) {
			System.out.println(ans);
			return 1;
			}
		if(curr > n) {
			return 0;
		}
		
		
		int x = 0;
		for(int dice = 1 ;dice <= 3 ; dice++) {
			x += Print(n, curr + dice ,ans + dice);
		}
		return x;
		
		
	}

}
