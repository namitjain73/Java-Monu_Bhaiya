package lecture_33;

public class Person {

	private String name = "Raj";
	private int age = 20;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
 
	public void setAge(int age){
		try {
			if(age < 0) {
				throw new Exception("Bklol age -ve nahi hoga");
			}
			this.age = age;
		}
			
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I amm in finally");
		}
	}

	//	public Person() {
//		
//	}
//	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}

}
