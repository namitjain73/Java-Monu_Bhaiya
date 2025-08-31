package lecture_34;

public class addnumber {
//method overloading
//	ploymorphisam
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,7));
		System.out.println(add(2,7,9));
		System.out.println(add(2,7,9.0));
		System.out.println(add(2,7,5,2,4,7,9,9,7,2,6,5,2,1,5));

	}
	
	public static int add(int a , int b) {
		return a+b;
	}
	
	public static int add(int a , int b , int c) {
		return a+b+c;
	}
	
//	public static void add(int a , int b , int c) {
//		return a+b+c;
//	}
	
	
	public static int add(int a , int b , Double c) {
		return (int)(a+b+c);
	}
//	variable number of argument int....a
	
	
	public static int add(int... a) {
		int sum = 0;
		for(int i =0 ; i <a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	public static int add(int x , int... a) {
		int sum = 0;
		for(int i =0 ; i <a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
