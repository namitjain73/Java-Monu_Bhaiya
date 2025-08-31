package lecture_45;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Raj", 77);
		map.put("pcr", 69);
		map.put("neelu", 10);
		map.put("nikhil", 55);
		System.out.println(map);
		
//		get
//		System.out.println(map.get("Raj"));
//		System.out.println(map.get("priya"));
//		containsKey
//		System.out.println(map.containsKey("neelu"));
//		System.out.println(map.containsKey("Amisha"));
//		remove
//		System.out.println(map.remove("kaju"));
//		System.out.println(map.remove("neelu"));
//		null as a key is allowed
//		it is created by linkedlist
		
//		red black tree is use to created treemap
//		in this the data are sorted by key
//		if in this are use sorting so comparator is used so if we sort by comparator it give null pointer 
//		in this the complexity is log(n
		TreeMap<String,Integer> tmap = new TreeMap<>();
//		
		tmap.put("Raj", 77);
		tmap.put("pcr", 69);
		tmap.put("neelu", 10);
		tmap.put("nikhil", 55);
//		tmap.put(null,00);
		System.out.println(tmap);
		
//		doubly linkedlist is use to created treemap
		LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>();
		lmap.put("Raj", 77);
		lmap.put("pcr", 69);
		lmap.put("neelu", 10);
		lmap.put("nikhil", 55);
		lmap.put(null,00);
		System.out.println(lmap);
		
		
		
		
		
		System.out.println(map.keySet());
		Set<String> key = map.keySet();
		for(String s : key) {
			System.out.println(map.get(s));
		}
		for(String s : map.keySet()) {
			System.out.println(map.get(s));
		}
		
		
		
		

	}
}
