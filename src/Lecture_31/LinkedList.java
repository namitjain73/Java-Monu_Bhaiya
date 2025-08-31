package Lecture_31;

public class LinkedList {
	class Node{
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
//	O(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(size == 0) {
			head = nn;
			tail = nn;
			size++;
		}
		else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	
	
	public void Display() {
		Node temp = head;
		 while(temp != null) {
			 System.out.print(temp.val + "-->");
			 temp = temp.next;
		 }
		 
		 System.out.println(".");
	}
	
	
	public void AddLast(int item) {
		if(size == 0) {
			AddFirst(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	
	
	private Node GetNode(int idx) throws Exception{
		if(idx  < 0 || idx >= size) {
			throw new Exception("Bklol k range me nhi h");
		}
		
		Node temp = head;		
		for(int i = 0 ;  i < idx ; i++) {
			temp = temp.next;
		}
		
		return temp;
	}
	
	public void Addat_index(int item , int k) throws Exception{
		if(k == 0) {
			AddFirst(item);
		}
		else if(k == size) {
			AddLast(item);
		}
		else {
			Node nn =  new Node();
			nn.val = item;
			Node pre = GetNode(k-1);
			nn.next = pre.next;
			pre.next = nn;
			size++;
		}
	}
	
	public int getFirst() {
		return head.val;
	}

	public int getLast() {
		return tail.val;
	}
	
	public int get_at_index(int k) throws Exception {
		return GetNode(k).val;
	}
	
	public int removeFirst() {
		int val = head.val;
		if(size == 1) {
			head = null;
			tail = null;
			size = 0;
		}
		else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		
		return val;
	}
	
	public int removeLast() throws Exception{
		if(size == 1) {
			return removeFirst();
		}
		
		else {
			int val = tail.val;
			Node temp = tail;
			Node pre = GetNode(size - 2);
			tail = pre;
			tail.next = null;
			size--;
			return val;
		}
	}
	
	
	public int remove_at_index(int k ) throws Exception{
		if(k == 0 ) {
			return removeFirst();
		}
		
		else if(k == size - 1) {
			return removeLast();
		}
		
		else {
			Node pre = GetNode(k - 1);
			Node curr = GetNode(k);
//			pre.next = pre.next.next;
			pre.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
			
		}
	}
}
