package lecture_15;

public class string_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello" + 10 + 20 + "Bye");
		System.out.println("Hello" + (10 + 20) + "Bye");
		System.out.println(10 + 20 + "Hello" + "Bye");
		

	}

}
// agar string ke baad kuch bhi hai vo sab string ki tarah treet hota hai
// but line no 10 me strating me int hai tho vo string ki tarah behave krega
// string change hoga but same location par nahi hoga uski ek copy banegi heap me par pool ke bahar
// 
