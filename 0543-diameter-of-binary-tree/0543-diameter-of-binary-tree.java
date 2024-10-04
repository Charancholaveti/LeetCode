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
//  public int diameterOfBinaryTree(TreeNode root) {
//         int []d1=new int[1];
//         height(root,d1);
//         return d1[0];
        
//     }
//     public int height(TreeNode root){
//         if(root==null) return 0;
//         int left=height(root.left,d1);
//         int right=height(root.right,d1);
//         d1[0]=Math.max(d1[0],left+right);
//         return 1+Math.max(left,right);
//     }
class Solution {
    private static int diameter=0;
    public static int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        diameter=Math.max(diameter,lh+rh);
        return Math.max(lh,rh)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        height(root);
        return diameter;
    }
}