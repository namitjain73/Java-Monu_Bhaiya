package lecture_17;

public class Static_Fun_Demo {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		static variable is a veriable which is use in whole code
		System.out.println(val);
		System.out.println(Add(2,7));
		System.out.println(val);

	}
	
	public static int Add(int a,int b) {
		int val = 50;
		val = val +  5;
//		to make it is globle
		Static_Fun_Demo.val = Static_Fun_Demo.val + 5;
		return a+b;
	}

}
