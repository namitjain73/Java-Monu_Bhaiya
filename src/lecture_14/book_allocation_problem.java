 package lecture_14;

import java.util.Arrays;
import java.util.Scanner;

public class book_allocation_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		https://codeskiller.codingblocks.com/problems/1365
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while(m-- > 0) {
			int noc = sc.nextInt();
			int nos = sc.nextInt();
			int[] pages = new int[noc];
			for(int i = 0 ; i < noc ;i++) {
				pages[i] = sc.nextInt();
			}
			Arrays.sort(pages);
			System.out.print(minimumpage(pages,nos));
		}

	}
	
	public static int minimumpage(int[] page,int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for(int i = 0 ; i < page.length;i++) {
			hi=hi+page[i];
		}
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(isitpossible(page,nos,mid)) {
				ans = mid;
				hi = mid - 1;
				
			}
			
			else {
				lo = mid + 1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] page,int nos,int mid) {
		int students = 1;
		int readpages = 0;
		for(int i = 0 ; i < page.length ;) {
			if(readpages+page[i] <= mid) {
				readpages = readpages+page[i];
				i++;
			}
			else {
				students++;
				readpages = 0;
			}
			if(students>nos) {
				return false;
			}
			
		}
		return true;
	}

}
