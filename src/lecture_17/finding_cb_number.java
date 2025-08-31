package lecture_17;

import java.util.Scanner;

public class finding_cb_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		System.out.println(isCBnumber(num));
		

	}
	
	public static boolean isCBnumber(Long num) {
		if(num ==0 || num == 1) {
			return false;
		}
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i = 0 ; i < arr.length ;i++) {
			if(num == arr[i]) {
				return  true;
			}
		}
		
		for(int i = 0 ; i < arr.length ;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
