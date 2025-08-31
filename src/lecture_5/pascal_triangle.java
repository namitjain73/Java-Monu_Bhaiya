package lecture_5;
import java.util.*;

public class pascal_triangle {

	public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int row = 0 ;
        int star = 1;
        while(row < n) {
//        	star
        	int i = 0;
        	long ncr = 1l;
        	while(i <  star) {
        		System.out.print(ncr+"\t");
        		ncr = ((row - i) * ncr )/(i + 1);
        		i++;
        	}
        	row++;
        	System.out.println();
        	star++;
        }

	}

}
