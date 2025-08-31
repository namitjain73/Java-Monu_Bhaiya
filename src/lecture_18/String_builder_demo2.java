package lecture_18;

public class String_builder_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_demo();

	}
	public static void String_demo() {
		String s = "";
		for(int i = 0 ; i < 1000 ; i++) {
			s = s + i;
		}
		System.out.println(s);
	}
	public static void StringBuilder_demo() {
		StringBuilder sb= new StringBuilder();
		for(int i = 0 ; i < 100 ; i++) {
			sb = sb.append(i);
		}
		System.out.println(sb);
	}

}
