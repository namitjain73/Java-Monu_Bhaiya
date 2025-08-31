package lecture_3;
import java.util.*;
// vertical mirroring
// binary to decimal to hexa decimal to octal
public class pattern_27_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int star = 1;
		int space = num - 1;
		int i = 1;
		int c = 1;
		while(i <= num) {
			int j = 1;
			int val = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			while(k <= star) {
				System.out.print("* ");
				k++;
				c++;
				
			}
			System.out.println();
			space--;
			i++;
			star += 2;
			
		}
		
		

	}

}