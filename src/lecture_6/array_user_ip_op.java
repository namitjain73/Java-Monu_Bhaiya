package lecture_6;
import java.util.*;

public class array_user_ip_op {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int []  arr = new int[n];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();		}
		Display(arr);
	}
	public static void Display(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);		}
	}

}
