package lecture_45;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set_Demo {
//	Set:-
//	1. HashSet
//	2. TreeSet
//	3. LinkedHashSet

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		all operations are done in constant time
		HashSet<Integer> set = new HashSet<>();
//		
		set.add(77);
		set.add( 69);
		set.add( 10);
		set.add( 55);
//		contains
		System.out.println(set.contains(1));
		System.out.println(set.contains(77));
//		remove
		System.out.println(set.remove(1));
		System.out.println(set.remove(77));
		for(int x : set) {
			System.out.println(x + " ");
		}
		
//		it is use TreeMap for implementation
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(77);
		tset.add( 69);
		tset.add( 10);
		tset.add( 55);
		System.out.println(tset);
		
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		lset.add(77);
		lset.add( 69);
		lset.add( 10);
		lset.add( 55);
		System.out.println(lset);
	}

}
