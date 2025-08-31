package lecture_19;

import java.util.Scanner;

public class sliding_window {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =  {2,3,1,1,5,7,8,4,2,3};
		int k = 3;
		n = Maximum_window(arr,k);
		System.out.print(n);
		
		
	}
	public static int Maximum_window(int[] arr,int k) {
		int sum = 0 , ans = 0;
		for(int i = 0 ; i < k ;i++) {
			sum += arr[i];
		}
		ans = sum ;
		for(int i = k ; i  <arr.length ; i++) {
			sum += arr[i];
			sum -= arr[i-k];
			ans = Math.max(ans, sum);
		}
		return ans;
		
	}

}
