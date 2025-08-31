package lecture_17;
import java.util.*;
public class ArraysList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Arraylist don't allow premitive datatype
//		List<Integer> ll = new ArrayList<>(); //it is also correct
		ArrayList<Integer> ll = new ArrayList<>();
//		when we don't gave <> then it is through a error : it is not save
		ll.add(10);
		ll.add(30);
		ll.add(40);
		ll.add(20);
		System.out.println(ll);
		ll.add(1,9); // time complecity is O(N);
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll);
		System.out.println(ll.remove(2));
		System.out.println(ll);
		System.out.println(ll.size());
//		ll.set(1, 15)
		System.out.println(ll.set(1, 15)); // O(N)
		System.out.println(ll);
		
		for(int i = 0 ; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		
		System.out.println();
		int[] arr = new int[5];
		for(int v:ll) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		for(int v:arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		
//		the initial capacity of a arraylist is 10
//whenever it is full then make a new arraylist by OldArry + OldArray/2 (10 + 5) and leave old array 
		Collections.sort(ll);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
		
		
		
		

	}

}
