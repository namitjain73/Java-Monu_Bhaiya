package lecture_15;

public class String_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1 == s2); // because in s1 and s2 compare the address 
		System.out.println(s1 == s3);
		System.out.println(s4 == s3);
		String s5 = "hello" + "bye";
		String s6 = "hello" + "bye";
		System.out.println(s5 == s6);
		System.out.println("Hello" + 10 + 20 + "Bye");// isme statement ki starting string se ho rahi hai 
		                                              // isliyeyaha par ye puri satement string ki tarah treat hogi
		System.out.println("Hello" + (10 + 20) + "Bye"); 
		System.out.println(10 + 20 + "Hello" + "Bye"); // but isme starting int se ho rahi hai tho starting values teated as a int and then string
		
		
		

	}

}
// non perimitive me == address compair karata hai or premitive me data 