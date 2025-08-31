  package lecture_16;
// 
public class wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  =10;
		Integer a1 = 10;  //****
		System.out.println(a);
		System.out.println(a1);  //****
		Long l = 10l;  //literal / typr cast
//		Character ch = 'a';
//		Boolean b1= true;
		Integer b = a;
		
//		auto boxing :- when a premitive data store in non premitive then it is know as boxing
//                       when a non-premitive data store in premitive then it is know as boxing
		
		


		
		int x = a1;
		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 128 ;
		Integer c4 = 128;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		Boolean b1 = false;
		Boolean b2 = true;
		System.out.println(b1 == b2);
		Character x2 = 'a';
		Character y1 = 'a';
		Character x1 = 'z';
		Character y = 'z';
		System.out.println(x2 == y1);
		System.out.println(x1 == y);
		
		
		
		
		
		a = 10; // primitive
		Integer y3 = Integer.valueOf(a); // wrapping
		int c = y3.intValue(); // unwrapping

		// Autoboxing (Java does this automatically)
		Integer x3 = a;

		// Auto-unboxing
		int y0 = x3;
	}

}
