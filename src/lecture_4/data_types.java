package lecture_4;

public class data_types {

	public static void main(String[] args) {
//     primitive data types in java
//	   for int - byte,short,int,long
//     for float - float , double
//     for string - char ,  boolean
//		the data type of following in hardcode is int
		byte b = 16 ;
		short s = 68 ;
		int i = 789;
		long l = 6678 ;
//		when the system type cast so 
//		when we store the big name as compare to range then it is start cyclic process
//		byte b1 = 168;
//	 	now it is print -88 b/z of cyclic process and according to bit masking
		byte b2 =  (byte)168;
		System.out.print(b2);// 168 is store in b2 only 8 bits
//		how to change the literal type cast : by type casting by following
//		long l = 12234567891;
		long o = 1234567891l;
//		 it is only required when we code in hardcode
		int a = 032;// it is octal number
		

	}

}
