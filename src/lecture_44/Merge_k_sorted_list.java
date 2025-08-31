package lecture_44;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_sorted_list {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode list =	{{1,4,5},{1,3,4},{2,6}};
		
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq= new PriorityQueue<>(new Comparator<>() {
			@Override
			public int compare(ListNode o1 , ListNode o2) {
				return o1.val - o2.val;
			}
		});
        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;
        for(int i = 0 ; i < lists.length ; i++) {
        	if(lists[i] != null) {
        		pq.add(lists[i]);
        	}
        }
        
        while(!pq.isEmpty()) {
        	ListNode r = pq.poll();
        	Dummy.next = r;
        	Dummy = Dummy.next;
        	if(r.next!=null) {
        		pq.add(r.next);
        	}
        }
        temp.next;
    }

}
