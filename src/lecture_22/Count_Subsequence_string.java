package lecture_22;

public class Count_Subsequence_string {

	public static void main(String[] args) {
		String ques = "abc";
//		print(ques,"");
//		System.out.print("\n"+count);
		System.out.print(Count_sub(ques,""));
	}
	
	public static int Count_sub(String ques ,String ans) {
	if(ques.length() == 0) {
		System.out.print(ans +" ");
		return 1;
	}
	char ch = ques.charAt(0);
	int n = Count_sub(ques.substring(1),ans);
	int m = Count_sub(ques.substring(1),ans+ch);
	return m + n;
}
	
	
	
	
	
//	static int count = 0;
//	public static void print(String ques ,String ans) {
//		if(ques.length() == 0) {
//			System.out.print(ans +" ");
//			count++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		print(ques.substring(1),ans);
//		print(ques.substring(1),ans+ch);
//	}

}
