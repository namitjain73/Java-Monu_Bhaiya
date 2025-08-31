package lecture_33;

public class Person_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("kunal" , 28);
//		Person p1 = new Person("Ankita",128);
//		System.out.println(p.age);
//		System.out.println(p.name);
//		Constructor ka name vahi hota hai jo uski class ka naam hota hai
//		DSUn 
//		p.age = 99;
		p.setAge(-20);
		System.out.println(p.getAge());
		System.out.println("Bye");
	}
	
	

}
