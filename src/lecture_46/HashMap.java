package lecture_46;
import java.util.ArrayList;
public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	
		
	}
	
	
	private int size = 0;
//	Node[] bukt = new Node[4];
//	we don't use arr because it is not support generic
	ArrayList<Node> bukt = new ArrayList<>();
	public HashMap(){
		this(4);
//		it is use to call one constructor to another constructor function
	}
	public HashMap(int n) {
		for(int i = 0 ; i < n ; i++) {
			bukt.add(null);
		}
		
	}
	
	public void put(K key, V value) {
//		Hash function
//		why we don't use arr[i]%4
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while(temp !=  null) {
//			when we want to compare a non_premitive data then always we use .equals
			if(temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
//			selenioum
		}
		
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = bukt.get(idx);
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
		
		double thf = 2.0;
		double lf = (1.0*size)/bukt.size();
		if(lf>thf) {
			rehashing();
		}
		
	}
	
	
	private void rehashing() {
		ArrayList<Node> new_bukt= new ArrayList<>();
		for(int i = 0 ; i < 2*bukt.size() ; i++) {
			new_bukt.add(null);
			
		}
		
		ArrayList<Node> oba = bukt;
		bukt = new_bukt;
		size = 0;
		for(Node nn : oba) {
			while(nn!= null) {
				put(nn.key,nn.value);
				nn = nn.next;
			}
		}
		
	}
	
	
	public V get(K key) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while(temp !=  null) {
			if(temp.key.equals(key)) {
				return temp.value; 
			}
			temp = temp.next;
		}
		return null;
	}
	
	@Override
	public String toString() {
		String s = "{";
		for(Node nn : bukt) {
			while(nn != null) {
				s = s  + nn.key + " " + nn.value + ",";
				nn = nn.next;
//				if(nn.next != null) s += ",";
			}
			
		}
		s += "}";
		return s;
	}
	
	
	public boolean containsKey(K key) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while(temp !=  null) {
			if(temp.key.equals(key)) {
				return true; 
			}
			temp = temp.next;
		}
		return false;
	}
	
	public V remove(K key) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		Node pre = null;
		while(temp  != null) {
			if(temp.key.equals(key)) {
				pre.next = temp.next;
				temp.next = null;
				break;
			}
			
			pre = temp;
			temp = temp.next;
		}
//		it is not  present in map
		if(temp == null) return null;
//		the first  element will be delete
		else if(pre == null) bukt.set(idx ,  temp.next);
		else pre.next = temp.next;
		
		temp.next = null;
		size--;
		return temp.value;
	}
	
	public int Hashfun(K key) {
//		hashCode is use to generate unique code and it is written inside object class
		int idx = key.hashCode()%bukt.size();
//		hashCode is use to only non-primitive
//		sometimes module can be negative
		if(idx<0) {
			idx += bukt.size();
		}
		return idx;
	}
	
}
