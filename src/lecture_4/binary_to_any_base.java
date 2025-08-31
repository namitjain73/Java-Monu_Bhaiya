package lecture_4;
import java.util.*;
public class binary_to_any_base {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("give th binary number : ");
		int n = sc.nextInt();
		System.out.print("give the base to convert:");
		int b = sc.nextInt();
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
		int m = sum;
		rem = 0;
		mul = 1;
		sum = 0;
		while(m>0) {
			rem = m % b;
			sum = sum + rem*mul;
			mul *= 2;
			m /=b;
		}
		System.out.print(sum);
	}

}
