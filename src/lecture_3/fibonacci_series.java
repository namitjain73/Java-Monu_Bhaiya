package lecture_3;
import java.util.*;

public class fibonacci_series {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a = 0;
			int b = 1;
			System.out.println(a + "\n" + b);
			for(int i = 1 ; i < n-1 ; i++) {
				int c = a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
			

		}

	}

