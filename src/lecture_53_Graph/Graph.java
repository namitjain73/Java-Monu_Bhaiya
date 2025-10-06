package lecture_53_Graph;
import java.util.HashMap;
import java.util.HashSet;
public class Graph {
	private HashMap<Integer , HashMap<Integer,Integer>> map;
	public Graph(int v) {
		map = new HashMap<>();
		for(int i = 1 ; i <= v ; i++) {
			map.put(i ,  new HashMap<>());
		}
	}
	
	public void AddEdge(int v1 , int v2 , int cost) {
		map.get(v1).put(v2 , cost);
		map.get(v2).put(v1, cost);
	}
	
	public boolean ContainsEdge(int v1 , int v2) {
		return map.get(v1).containsKey(v2);
	}
	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}
	public int noOfEdge() {
		int sum = 0;
		for(int vtx : map.keySet()) {
			sum  += map.get(vtx).size();
		}
		return sum/2;
	}
	
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	
	public void removeVertex(int v1) {
		for(int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		
		map.remove(v1);
	}
	
	public void Display() {
		for(int v : map.keySet()) {
			System.out.println(v + " " + map.get(v));
		}
	}
	
//	there is path exist between src and des
	public  boolean HashPath(int src , int des,HashSet<Integer> visited) {
		if(src == des) return true;
		visited.add(src);
		for(int i : map.get(src).keySet()) {
			if(!visited.contains(i)) {
				boolean flag = HashPath(i,des,visited);
				if(flag) return true;
			}
		}
		return false;
	}
	
	public void AllPaths(int src , int des , HashSet<Integer> visited , String s ) {
		if(src == des) {
			System.out.println(s+des);
			return;
		}
		visited.add(src);
		for(int i : map.get(src).keySet()) {
			if(!visited.contains(i)) {
				AllPaths(i,des,visited,s+src);
			}
		}
		visited.remove(src);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
