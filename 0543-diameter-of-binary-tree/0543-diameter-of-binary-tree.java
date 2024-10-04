/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int []d1=new int[1];
        height(root,d1);
        return d1[0];
    }
    public int height(TreeNode root,int [] d1){
        if(root==null) return 0;
        int left=height(root.left,d1);
        int right=height(root.right,d1);
        d1[0]=Math.max(d1[0],left+right);
        return 1+Math.max(left,right);
    }
}