package lecture_28;
import java.util.Random;
public class Random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si = 10;
		int ei = 100;
//		class is just like a blueprint
		Random rn = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			int x = rn.nextInt(ei - si +1) + si;
			System.out.println(x);
		}
//		bound is the total uniqe numbers in the range
//		rn.nextInt(bound);
//		this bound always start with 0 and end : 90 so we add the si value to take it range 90 + 10 = 91
	}

}
