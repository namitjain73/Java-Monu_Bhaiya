package lecture_6;

public class Array_Demo {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
//		print the arr adderss
		System.out.println(arr);
		int[][] other = arr;
		System.out.println(other);
		System.out.println(other.length);
		System.out.println(other);
	}

}
