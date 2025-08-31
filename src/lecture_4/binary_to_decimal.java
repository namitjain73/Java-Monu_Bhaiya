package lecture_4;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int rem = 1;
		int mul =1;
		while(n > 0) {
			rem = n%10;
			n = n/10;
			sum = sum + rem*mul;
			mul = mul * 2;
			
			
		}
		System.out.print(sum);

	}

}
