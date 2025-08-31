  package lecture_37_nonlenear_datastructure;

import java.util.Scanner;

public class BinaryTree {
	
	class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	public BinaryTree() {
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
