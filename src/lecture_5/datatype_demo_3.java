package lecture_5;

public class datatype_demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'a';
		System.out.println(a);
		char ch = 'a';
		System.out.println((int) (ch));
		ch++;
		System.out.println(ch);
//		ch = ch +1; error 
		System.out.println(ch);
		for(byte b=0 ; b < 128 ; b++) {
			System.out.println(b);
		}
	}

}
