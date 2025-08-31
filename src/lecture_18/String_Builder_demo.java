package lecture_18;

public class String_Builder_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
//		  add
		sb.append("jkklkjjjlkl");
		System.out.println(sb);
		sb.append(false);
		sb.append(7);
//		sb.append('a');
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
//		Stringbuilder to string
		String str = sb.toString();
//		string to string builder
		String str1 = "cejfrebfierifreiufb";
		sb.append(str1);

	}

}
//  the defult capacity of string builder is 16
// string builder and buffer are the same thing but buffer is a shichonized
// when the stringbuilder capacity is full then (Old-size * 2) + 2
// in vectur the size increase by 2*old-size

