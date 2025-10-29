package lec39;

public class Symmetric_Tree {
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
        public boolean isSymmetric(TreeNode root) {
            return Symmetric(root.left,root.right);
        }

        public boolean Symmetric(TreeNode root1, TreeNode root2){
            if(root1==null && root2==null){
                return true;
            }
            if(root1==null || root2==null){
                return false;
            }
            if(root1.val!=root2.val){       // Agr structure compare krenge to ye wali condition nhi lenge
                return false;
            }
            boolean left = Symmetric(root1.left, root2.right);   // Equal check krne ke liye left ko left se 
            boolean right = Symmetric(root1.right, root2.left);   // aur right ko right se 
            return left && right;
        }
    }
}
//Leetcode-101
