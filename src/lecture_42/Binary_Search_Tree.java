package lecture_42;

import lecture_37_nonlenear_datastructure.BinaryTree.Node;

public class Binary_Search_Tree {
	
	class Node{
		int val;
		Node left;
		Node right;
	}
	
	
	private Node root;
	public Binary_Search_Tree(int[] in) {
		root = Create_Tree(in,0,in.length-1);
	}
	
	private Node Create_Tree(int[] in , int si , int ei) {
		if(si > ei) return null;
		
		
		
		int mid = (si+ei)/2;
		Node nn = new Node();
		nn.val = mid;
		nn.left = Create_Tree(in,si,mid-1);
		nn.right = Create_Tree(in,mid+1,ei);
		
		
		return nn;
		
	}
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		
		if(nn  == null) return;
		String str = "<--"+ nn.val + "-->";
		if(nn.left != null) {
			str = nn.left.val+str;
		}
		else {
			str = "." + str;
		}
		if(nn.right != null) {
			str = str+nn.right.val;
		}
		else {
			str = str + ".";
		}
		
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}

}
