package lecture_3;

import java.util.Scanner;

public class pattern_q_assiment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int star = 1;
		int space = num -1;
		int row = 1;
		int val = 1;
		while(row <= num*2-1) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = val;
			while(j <= star) {
				System.out.print(p+" ");
				if(j <= star/2) {
					p++;
				}else {
					p--;
				}
				j++;
			}
			if (row < num ) {
				star += 2;
				space--;
				val ++;
			}
			else {
				star -=2;
				space ++;
				val--;
			}
			row++;
			System.out.println();
		}

	}

}
