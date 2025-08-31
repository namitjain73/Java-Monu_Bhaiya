package lecture_38;

import java.util.* ;
import java.util.Scanner;

public class Tree_Question {
	
	class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	public Tree_Question() {
		root = CreateTree();
		
	}

	private Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
//		hlc - has left child
//		hrc - has right child
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = CreateTree();
		}
		return nn;
		
	}
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node nn , int item) {
		if(nn == null) {
			return false; 
		}
		if(nn.val == item) {
			return true;
		}
		
		boolean left = find(nn.left , item);
		boolean right = find(nn.right , item);
		return left||right;
	}
	
	
	public int max() {
		return max(root);
	}
	
	private int max(Node nn) {
		 if(nn == null) {
			 return Integer.MIN_VALUE;
		 }
		 int lmax = max(nn.left);
		 int rmax = max(nn.right);
		 return Math.max(nn.val , Math.max(lmax, rmax));
	}
	
	public int ht() {
		return ht(root);
	}
	
	private int ht(Node nn) {
		if(nn == null) {
//			return 0; 
			return -1;
		}
		
		int ih = ht(nn.left);
		int rh = ht(nn.right);
		return Math.max(ih ,  rh ) + 1;
	}
	
	public void PerOrder() {
		 PerOrder(root);
		 System.out.println();
	}
	
	private void PerOrder(Node nn) {
		if(nn == null) return;
		System.out.println(nn.val + " ");
		PerOrder(nn.left);
		PerOrder(nn.right);
	}
	
	public void InOrder() {
		 InOrder(root);
		 System.out.println();
	}
	
	private void InOrder(Node nn) {
		if(nn == null) return;
		InOrder(nn.left);
		System.out.println(nn.val + " ");
		InOrder(nn.right);
	}
	
	public void PostOrder() {
		 PostOrder(root);
		 System.out.println(); 
	}
	
	private void PostOrder(Node nn) {
		if(nn == null) return;
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.println(nn.val + " ");
	}
	
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root); //addlast
		while(!q.isEmpty()) {
			Node n = q.poll();  //q.remove() --> removefirst
			System.out.print(n.val + " ");
			if(n.left != null) {
				q.add(n.left);
			}
			if(n.right != null) {
				q.add(n.right);
			}
		}
		System.out.println();
	}

}
