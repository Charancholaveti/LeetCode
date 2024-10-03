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
    public List<Integer> postorderTraversal(TreeNode root) {
        // List<Integer> list = new ArrayList<>();
        // if(root == null) return new ArrayList<>();
        // postorderTraversal(root.left);
        // postorderTraversal(root.right);
        // list.add(root.val);
        // return list;
        Stack<TreeNode>s1=new Stack<>();
        Stack<TreeNode>s2=new Stack<>();
        List<Integer> al = new ArrayList<>();
        if(root == null) return al;
        s1.push(root);
        while(!s1.isEmpty()){
            root=s1.pop();
            s2.add(root);
            if(root.left!=null) s1.add(root.left);
            if(root.right!=null) s1.add(root.right);
        }
        while(!s2.isEmpty()){
            al.add(s2.pop().val);
        }
        return al;
    }
}