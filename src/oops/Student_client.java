package oops;

public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = " kaju";
		s.age = 20;
		s.Intro_yourself();
		
		Student s1 = new Student();
		s1.name = "kamlesh";
		s1.age = 18;
		s1.Intro_yourself();
		
		s1.sayHey("Rakesh");
		Student.say_mentormonu();
	}
		
		static {
			System.out.println("i am static block in main");
		}
		

}
