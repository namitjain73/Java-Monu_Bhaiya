package lecture_39;

public class Sum_Root_to_Leaf_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
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
		    public int sumNumbers(TreeNode root) {
		    	return r(root,0);
		    }
		    
		    public int r(TreeNode root , int sum) {
		    		if(root == null) {
		    			return 0;
		    		}
		    		if(root.left == null && root.right == null) {
		    			return sum*10+root.val;
		    		}
		    		
		    		
		    		
		    	int n = r(root.left , sum*10+root.val);
		    	int m = r(root.right , sum*10+root.val);
		    	return n + m;
		        
		    }
		}

}
