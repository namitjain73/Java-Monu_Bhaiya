package lecture_40;

public class Q1_LC_543_DiameterOfABinaryTree {

	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	class Solution {
	    public int diameterOfBinaryTree(TreeNode root) {
	        int ld = diameterOfBinaryTree(root.left);
	        int rd = diameterOfBinaryTree(root.right);
	        int sd = ht(root.left) + ht(root.right) + 2;
	        return Math.max(sd, Math.max(rd, ld));
	    }
	    public int ht(TreeNode root) {
	    	if(root == null) {
	    		return -1;
	    	}
	    	int lh = ht(root.left);
	    	int rh = ht(root.right);
	    	return Math.max(lh, rh) + 1;
	    }
	}

}

// Diameter of a binary tree --> maximum distance bw any two nodes (leaves node) of the tree.
// All the previous codes have TC of O(n).

