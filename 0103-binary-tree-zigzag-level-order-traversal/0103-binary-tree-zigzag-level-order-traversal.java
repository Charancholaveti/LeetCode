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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return al;
        boolean flag=true;
        q.add(root);
        while(!q.isEmpty()){
          int size=q.size();
          List<Integer>row=new ArrayList<>();
          for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            row.add(node.val);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
          }
          if(!flag){
            Collections.reverse(row);
          }
          al.add(row);
          flag=!flag;
        }
        return al;
    }
}