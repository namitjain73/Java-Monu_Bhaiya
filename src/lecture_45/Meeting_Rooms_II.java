package lecture_45;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {
	public static void main(String[] args) {
		int[][] intervals = {{10,30},{5,10},{15,20},{2,6},{12,18},{19,20},{1,5},{3,5}};
		
		Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
//		Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
//		to sort into reverse order
//		Arrays.sort(intervals , (a,b) -> Integer.compare(b[0],a[0]));
//		Arrays.sort(intervals , (a,b) -> b[0] - a[0]);
		
		for(int i = 0 ; i < intervals.length ; i++) {
			System.out.println(intervals[i][0] + "  " + intervals[i][1]);
		}
		
		
	}
	
	
	public static int Meeting_Room(int[][] intervals) {
		Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
		pq.add(intervals[0]);
		for(int i = 1 ; i < intervals.length ; i++) {
			if(intervals[i][0] >= pq.peek()[1]) {
				pq.poll();
			}
			
			pq.add(intervals[i]);
		}
		return pq.size();
		
	}
}
