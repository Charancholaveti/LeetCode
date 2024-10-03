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
    //     static void preorder(TreeNode root, List<Integer> arr) {
    //     if (root == null) {
    //         return;
    //     }
    //     arr.add(root.val);
    //     preorder(root.left, arr);
    //     preorder(root.right, arr);
    //   }
    public List<Integer> preorderTraversal(TreeNode root) {
        // List<Integer> arr = new ArrayList<>();
        // preorder(root, arr);
        // return arr;
        List<Integer>al=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        if(root==null) return al;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            al.add(temp.val);
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
        return al;
    }
}