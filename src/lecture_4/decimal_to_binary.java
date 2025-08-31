package lecture_4;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		int sum = 0;
		while(n>0) {
			int rem = n % 2;
			sum = sum + rem*mul;
			mul *= 10;
			n /=2;
		}
		System.out.print(sum);

	}

}
