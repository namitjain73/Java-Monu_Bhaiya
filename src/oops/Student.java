package oops;

public class Student {

	String name;
	int age;
	
	public void Intro_yourself() {
		System.out.println("My name is" + this.name + " And my age is " + this.age);
	}
	
	
	public void sayHey(String name) {
		System.out.println(this.name + " hey " + name);
	}
	public static void say_mentormonu() {
		System.out.println("I am the mentor of CD");
	}
	
	static {
		System.out.println("i am static block in field");
	}

}
