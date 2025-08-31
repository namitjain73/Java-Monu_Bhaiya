package lecture_44;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.add(5);
		hp.add(6);
		hp.add(7);
		hp.add(8);
		hp.add(9);		
		hp.add(10);
		hp.add(11);
		hp.Display();
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(5);
		pq.add(6);
		pq.add(7);
		pq.add(8);
		pq.add(9);		
		pq.add(10);
		pq.add(11);
		System.out.println(pq);
	}

}
