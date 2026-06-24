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
     int min = Integer.MAX_VALUE;
    List<Integer> li=new ArrayList<>();
    public void solver(TreeNode root) {
        if (root == null)
            return;
      
        solver(root.left);
        li.add(root.val);
       solver(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
         min = Integer.MAX_VALUE;
        solver(root);
        for(int i=0;i<li.size()-1;i++){
            min=Math.min(min,Math.abs(li.get(i)-li.get(i+1)));
        }
        return min;
        
    }
}