package lecture_24;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		Print(m-1,n-1,0,0,"");

	}
	public static void Print(int m ,int n ,int cr ,int cc ,String ans) {
		if(m == cr && n == cc) {
			System.out.println(ans);
			return;
		}
		if(cr > m || cc > n) {  
			return;
		}
		
				Print(m,n,cr+1,cc,ans+"h");
				Print(m,n,cr,cc+1,ans+"v");
		return;
	}

}
