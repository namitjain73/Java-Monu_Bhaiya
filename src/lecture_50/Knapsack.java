package lecture_50;

public class Knapsack {
//	Knapsack are three types
//	 0 and 1 Knapsack
//	 0 or n Knapsack
//	frecsiti onal Knapsack
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap= 4;
		int[] wt = {1,2,3,2,2};
		int[] val = {8,4,0,5,3};
		

	}
	
	
	public static int Knapsack(int[] wt , int[] val , int cap , int i) {
		if(cap == 0 || i == wt.length) {
			return 0;
		}
		int inc =0 , exc = 0;
		if(cap >= wt[i]) {
			inc = val[i] + Knapsack(wt,val,cap-wt[i],i+1);
		}
		
		exc = Knapsack(wt , val , cap , i+1);
		return Math.max(inc, exc); 	
		}

}
